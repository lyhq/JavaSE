package com.lyhq.design.patterns.AbstractFactory;

/**
 * 具体的工厂类，实现工厂接口
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		//生产黑猫一只
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		//生产黑狗一只
		return new BlackDog();
	}

}
