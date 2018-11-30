package com.lyhq.design.patterns.Decorator;

/**
 * 被装饰者类
 * @author yangrun
 * @date 2018年11月22日
 */
public class Source implements Sourceable {

	@Override
	public void targetMethod() {
		System.out.println("被装饰类目标方法执行...");
	}

}
