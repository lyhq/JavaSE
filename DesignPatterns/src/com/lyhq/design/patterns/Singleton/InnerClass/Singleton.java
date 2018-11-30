package com.lyhq.design.patterns.Singleton.InnerClass;

/**
 * 使用静态内部类的方式（天然的线程安全类）
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class Singleton {

	private Singleton() {}
	
	private static class InnerSingleton {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return InnerSingleton.instance;
	}
}
