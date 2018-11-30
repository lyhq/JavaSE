package com.lyhq.design.patterns.Decorator;

/**
 * 装饰类，包含被装饰类的对象，实现动态的给被装饰类添加功能
 * @author yangrun
 * @date 2018年11月22日
 */
public class Decorator implements Sourceable {
	
	private Sourceable source;
	
	//将被装饰类的对象设置进来
	public Decorator(Sourceable source) {
		this.source = source;
	}

	@Override
	public void targetMethod() {
		System.out.println("before decorator...");
		source.targetMethod();
		System.out.println("after decorator...");
	}

}
