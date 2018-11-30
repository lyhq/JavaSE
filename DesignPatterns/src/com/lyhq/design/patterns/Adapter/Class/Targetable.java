package com.lyhq.design.patterns.Adapter.Class;

/**
 * 目标接口，用于适配的接口
 * @author yangrun
 * @date 2018年11月22日
 */
public interface Targetable {

	//和原始类一样（同名）的方法
	public void method1();
	
	//接口自己的方法，也就是用于扩展的方法
	public void method2();
}
