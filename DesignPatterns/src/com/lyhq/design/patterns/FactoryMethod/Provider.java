package com.lyhq.design.patterns.FactoryMethod;

/**
 * 具体的工厂需要实现的接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public interface Provider {

	//生产具体的工厂所创建的对象
	Sender produce();
}
