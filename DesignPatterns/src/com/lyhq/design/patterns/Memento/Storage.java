package com.lyhq.design.patterns.Memento;

/**
 * 
 * 保存备忘录的类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class Storage {

	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
