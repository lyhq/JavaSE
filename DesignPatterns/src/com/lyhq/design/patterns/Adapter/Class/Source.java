package com.lyhq.design.patterns.Adapter.Class;

/**
 * 原始的类，也就是需要被适配的类
 * 目标类，拥有一个方法method1，待适配，目标接口是 Targetable
 * @author yangrun
 * @date 2018年11月22日
 */
public class Source {

	//需要被适配的目标方法
	public void method1() {
		System.out.println("Source...method...被适配的目标方法执行...");
	}
}
