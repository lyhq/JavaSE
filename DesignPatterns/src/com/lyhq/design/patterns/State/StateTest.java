package com.lyhq.design.patterns.State;

/**
 * 状态模式
 * 当对象的状态改变时，同时改变其行为，很好理解！
 * 就拿 QQ 来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，而且你的好友也能看到你的状态，
 * 所以，状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化。
 * 
 * 参与者
 * State 类是个状态类
 * Context 类可以实现状态切换
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class StateTest {
	public static void main(String[] args) {
		State state = new State("state1");
		Context context = new Context();
		context.setState(state);
		
		context.method();
		
		state.setValue("state2");
		context.setState(state);
		context.method();
	}
}
