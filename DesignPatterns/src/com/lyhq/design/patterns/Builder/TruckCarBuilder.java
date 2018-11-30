package com.lyhq.design.patterns.Builder;

/**
 * 具体的建造者
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class TruckCarBuilder implements ICarBuilder {

	private Car car;

	public TruckCarBuilder() {
		car = new SedanCar();
	}

	@Override
	public void buildWheel() {
		System.out.println("建造方向盘");
		car.setWheel("奔驰方向盘");
	}

	@Override
	public void buildTyre() {
		System.out.println("建造轮胎");
		car.setTyre("天能轮胎");
	}

	@Override
	public void buildEngine() {
		System.out.println("建造发动机");
		car.setEngine("悍马发动机");
	}

	@Override
	public Car getCar() {
		return car;
	}

}
