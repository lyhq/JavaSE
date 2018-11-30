package com.lyhq.design.patterns.AbstractFactory;

/**
 * 具体的对象4,实现接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class WhiteCat implements ICat {

	@Override
	public void eat() {
		System.out.println("WhiteCat...eat...");
	}

}
