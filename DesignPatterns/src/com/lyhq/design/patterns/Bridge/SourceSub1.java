package com.lyhq.design.patterns.Bridge;

/**
 * 目标对象1，需要被桥接操作的对象
 * @author yangrun
 * @date 2018年11月28日
 */
public class SourceSub1 implements Sourceable {

	@Override
	public void method() {
		System.out.println("SourceSub1...method...");
	}

}
