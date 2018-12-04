package com.lyhq.design.patterns.Strategy;

/**
 * Context类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	//目标方法
	public void doMethod() {
		strategy.method();
	}
}
