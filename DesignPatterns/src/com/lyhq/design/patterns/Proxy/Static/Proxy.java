package com.lyhq.design.patterns.Proxy.Static;

/**
 * 代理类，实现被代理类想要完成的任务
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Proxy implements Sourceable {

	private Source source;

	public Proxy(Source source) {
		this.source = source;
	}

	@Override
	public void method() {
		beforeMethod();
		source.method();
		afterMethod();
	}

	private void afterMethod() {
		System.out.println("after proxy method");
	}

	private void beforeMethod() {
		System.out.println("before proxy method");
	}

}
