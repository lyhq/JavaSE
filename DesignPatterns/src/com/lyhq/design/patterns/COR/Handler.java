package com.lyhq.design.patterns.COR;

/**
 * 职责链（责任链）模式， 所有处理者的抽象类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public abstract class Handler {

	// 责任链中的下一个元素
	protected Handler nextHandler;

	// 共有方法，设置下一个处理者
	public void setNextHandler(Handler handler) {
		this.setNextHandler(handler);
	}

	// 处理请求
	public void handleRequest(Request request) {
		if (/*当前处理者可以处理, 伪代码*/true) {
			//处理请求的逻辑...
		} else {//交给下一个handler来处理
			this.nextHandler.handleRequest(request);
		}
	}
}
