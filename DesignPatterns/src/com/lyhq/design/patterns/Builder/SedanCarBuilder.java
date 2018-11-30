package com.lyhq.design.patterns.Builder;

/**
 * 具体的建造者
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class SedanCarBuilder implements ICarBuilder {

	private Car car;

	public SedanCarBuilder() {
		car = new SedanCar();
	}

	@Override
	public void buildWheel() {
		System.out.println("建造方向盘");
		car.setWheel("宝马方向盘");
	}

	@Override
	public void buildTyre() {
		System.out.println("建造轮胎");
		car.setTyre("超能轮胎");
	}

	@Override
	public void buildEngine() {
		System.out.println("建造发动机");
		car.setEngine("法拉利发动机");
	}

	@Override
	public Car getCar() {
		return car;
	}

}
