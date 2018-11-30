package com.lyhq.design.patterns.FactoryMethod;

/**
 * 具体的工厂类，实现工厂接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
