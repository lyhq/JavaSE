package com.lyhq.design.patterns.Facade;

/**
 * Memory类，子系统
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Memory {

	public void startUp() {
		System.out.println("memory start up...");
	}
	
	public void shutdown() {
		System.out.println("memory shutdown...");
	}
}
