package com.lyhq.design.patterns.AbstractFactory;

/**
 * 抽象工厂模式
 * 
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 
 * 参与者
 * 1.AbstractFactory（IAnimalFactory） 声明一个创建抽象产品对象的操作接口。
 * 2.ConcreteFactory（BlackAnimalFactory、WhiteAnimalFactory） 实现创建具体产品对象的操作。
 * 3.AbstractProduct（ICat、IDog） 为一类产品对象声明一个接口。 
 * 4.ConcreteProduct（WhiteCat、BlackCat、WhiteDog、BlackDog） 定义一个将被相应的具体工厂创建的产品对象。实现AbstractProduct接口。
 * 5.AbstractFactoryTest 仅使用由AbstractFactory和AbstractProduct类声明的接口
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		IDog blackDog = blackAnimalFactory.createDog();
		blackCat.eat();
		blackDog.eat();

		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		ICat whiteCat = whiteAnimalFactory.createCat();
		IDog whiteDog = whiteAnimalFactory.createDog();
		whiteCat.eat();
		whiteDog.eat();

	}
}
