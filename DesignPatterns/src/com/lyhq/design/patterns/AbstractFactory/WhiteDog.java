package com.lyhq.design.patterns.AbstractFactory;

/**
 * 具体的对象2，实现接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class WhiteDog implements IDog {

	@Override
	public void eat() {
		System.out.println("WhiteDog...eat...");
	}

}
