package shk.lyhq.design.patterns.Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色基本可以存放文法中各个终结符所对应的具体值，下面的类就是用一个map来负责。
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Context {

	private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

	//赋值操作
	public void assign(Variable var, int value) {
		map.put(var, new Integer(value));
	}

	//获取值
	public int lookup(Variable var) throws IllegalArgumentException {
		Integer value = map.get(var);
		if (value == null) {
			throw new IllegalArgumentException();
		}
		return value.intValue();
	}
}
