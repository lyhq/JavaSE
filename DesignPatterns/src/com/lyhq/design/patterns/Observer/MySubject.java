package com.lyhq.design.patterns.Observer;

/**
 * 主对象，真正被观察者观察的对象
 * @author yangrun
 * @date 2018年11月22日
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("mySubject self operation!");
		notifyObservers();//通知所有观察者
	}
}
