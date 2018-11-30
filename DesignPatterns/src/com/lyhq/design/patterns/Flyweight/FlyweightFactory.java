package com.lyhq.design.patterns.Flyweight;

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

	//创建共享池
	private static Map<String, Flyweight> sharePool = new HashMap<String, Flyweight>();
	
	public FlyweightFactory(String key) {
		sharePool.put(key, new ConcreteFlyweight());
	}
	
	//获取
	public static Flyweight getFlyweight(String key) {
		if (sharePool.get(key) == null) {//共享池没有对象了
			sharePool.put(key, new ConcreteFlyweight());
		}
		return sharePool.get(key);
	}
	
	//获取共享池中对象的个数
	public static int getSize() {
		return sharePool.size();
	}
}
