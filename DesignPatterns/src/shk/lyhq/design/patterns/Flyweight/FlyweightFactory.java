package shk.lyhq.design.patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建并管理flyweight对象。 确保合理地共享flyweight。
 * 当用户请求一个flyweight时，FlyweightFactory对象提供一个已创建的实例或者创建一个（如果不存在的话）。
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class FlyweightFactory {

	private static Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

	public FlyweightFactory(String key) {
		flyweights.put(key, new ConcreteFlyweight());
	}

	public static Flyweight getFlyweight(String key) {
		if (flyweights.get(key) == null) {//池里面没有对象了
			flyweights.put(key, new ConcreteFlyweight());
		}
		return flyweights.get(key);
	}

	public static int getSize() {
		return flyweights.size();
	}
}
