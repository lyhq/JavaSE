package com.lyhq.design.patterns.Adapter.Object;

/**
 * 适配类
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
