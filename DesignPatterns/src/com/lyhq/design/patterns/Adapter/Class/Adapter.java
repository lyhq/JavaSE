package com.lyhq.design.patterns.Adapter.Class;

/**
 * 适配器类，将 Source 的功能扩展到 Targetable里
 * 实现适配器接口并实现适配器自定义方法就可以不仅拥有原来类的功能，还有适配器接口提供的功能
 * @author yangrun
 * @date 2018年11月22日
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
	
}
