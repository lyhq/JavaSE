package com.lyhq.design.patterns.COR;

/**
 * 发出的请求
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Request {

	private String name;// 请求的名字

	private String msg;// 请求内容

	public Request(String name, String msg) {
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
