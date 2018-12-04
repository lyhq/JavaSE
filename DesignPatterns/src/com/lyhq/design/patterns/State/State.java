package com.lyhq.design.patterns.State;

/**
 * 状态类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class State {

	private String value;

	public State(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("execute the first opt...");
	}

	public void method2() {
		System.out.println("execute the second opt...");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
