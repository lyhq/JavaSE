package com.lyhq.design.patterns.COR.Scene.Complex;

/**
 * 请求的抽象类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public abstract class AbstractRequest {

	protected String name;// 名字

	protected String msg;// 内容

	public AbstractRequest(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
