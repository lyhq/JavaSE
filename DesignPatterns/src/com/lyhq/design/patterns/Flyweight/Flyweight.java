package com.lyhq.design.patterns.Flyweight;

/**
 * Flyweight接口，通过这个接口flyweight对象可以接受并作用于外部状态。
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public interface Flyweight {

	//flyweight对象目标方法
	void action(int arg);
}
