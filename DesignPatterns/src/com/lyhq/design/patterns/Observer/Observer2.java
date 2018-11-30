package com.lyhq.design.patterns.Observer;

/**
 * 观察者接口的实现类2，真正的观察者
 * @author yangrun
 * @date 2018年11月22日
 */
public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("Observer2 has received, subject has changed!");
	}

}
