package com.lyhq.design.patterns.Template;

/**
 * 具体的模板类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class ConcreteTemplate extends Template {

	@Override
	void print() {
		System.out.println("这是子类重写了父类的抽象方法");
	}

}
