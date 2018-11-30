package com.lyhq.design.patterns.Builder;

/**
 * 实体对象类（建造的产品 Product）
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class Car {

	private String wheel;// 方向盘
	private String tyre;// 轮胎
	private String engine;// 发动机

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", tyre=" + tyre + ", engine=" + engine + "]";
	}

}
