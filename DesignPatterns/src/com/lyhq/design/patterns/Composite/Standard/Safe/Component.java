package com.lyhq.design.patterns.Composite.Standard.Safe;

/**
 * Component抽象构件角色：定义参加组合对象的共有方法和属性，可以定义一些默认的行为或属性， 
 * 比如我们例子中的getInfo就封装到了抽象类中
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public abstract class Component {
	// 个体和整体都具有的共享
	public void doSomething() {
		// 编写业务逻辑
		System.out.println("Component...doSomething...");
	}
}
