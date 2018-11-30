package com.lyhq.design.patterns.Proxy.Static;

/**
 * 被代理类, 实现接口
 * @author yangrun
 * @date 2018年11月22日
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("this is original method!");
	}

}
