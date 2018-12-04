package com.lyhq.design.patterns.Memento;

/**
 * 原始类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class Original {

	private String state;

	public Original(String state) {
		super();
		this.state = state;
	}

	// 创建一个备忘录
	public Memento createMemento() {
		return new Memento(state);
	}

	// 恢复备忘录
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public void showState() {
		System.out.println("当前状态：" + state);
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
