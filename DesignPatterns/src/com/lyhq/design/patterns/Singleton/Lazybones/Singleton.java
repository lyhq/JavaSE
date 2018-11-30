package com.lyhq.design.patterns.Singleton.Lazybones;

import java.util.concurrent.TimeUnit;

/**
 * 单例模式（懒汉式）
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			try {
				// 模拟初始化对象的准备时间
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.getInstance().hashCode());
			}
		}, "t1");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.getInstance().hashCode());
			}
		}, "t2");

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Singleton.getInstance().hashCode());
			}
		}, "t3");

		t1.start();
		t2.start();
		t3.start();
	}
}
