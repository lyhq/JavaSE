package com.lyhq.design.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主体对象的抽象类，主要实现对观察者列表的监控
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public abstract class AbstractSubject implements Subject {

	private List<Observer> observerList = new ArrayList<>();

	// 添加
	@Override
	public void add(Observer observer) {
		observerList.add(observer);
	}

	// 删除
	@Override
	public void delete(Observer observer) {
		observerList.remove(observer);
	}

	// 通知所有观察者
	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}

}
