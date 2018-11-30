package com.lyhq.design.patterns.Observer;

/**
 * 主体对象接口，也就是目标对象
 * @author yangrun
 * @date 2018年11月22日
 */
public interface Subject {

	//增加观察者
	public void add(Observer observer);
	
	//删除观察者
	public void delete(Observer observer);
	
	//通知所有观察者
	public void notifyObservers();
	
	//主体对象自己的操作
	public void operation();
}
