package com.lyhq.design.patterns.FactoryMethod;

/**
 * 具体的 工厂所创建的对象, 实现对象接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class SmsSender implements Sender {

	@Override
	public void sendMessage() {
		System.out.println("SmsSender...sendMessage...");
	}

}
