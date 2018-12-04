package com.lyhq.design.patterns.State;

/**
 * 状态模式的切换类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class Context {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	//状态改变，行为也将改变
	public void method() {
		if (this.state.getValue().equals("state1")) {
			this.state.method1();
		} else if (this.state.getValue().equals("state2")) {
			this.state.method2();
		}
	}
}
