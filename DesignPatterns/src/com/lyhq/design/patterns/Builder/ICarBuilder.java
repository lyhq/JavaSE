package com.lyhq.design.patterns.Builder;

/**
 * 建造者接口（抽象的建造者）
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public interface ICarBuilder {

	void buildWheel();//建造方向盘
	
	void buildTyre();//建造轮胎
	
	void buildEngine();//建造发动机
	
	Car getCar();//完成建造, 获取最终的产品交货
}
