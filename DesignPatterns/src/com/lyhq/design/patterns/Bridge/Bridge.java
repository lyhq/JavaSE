package com.lyhq.design.patterns.Bridge;

/**
 * 抽象的桥接类，含有一个Sourceable对象的实例
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public abstract class Bridge {

	private Sourceable source;

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

	// 目标方法，实际调用的被桥接对象的目标方法
	public void method() {
		source.method();
	}
}
