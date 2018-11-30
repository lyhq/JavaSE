package com.lyhq.design.patterns.Prototype;

/**
 * 一个原型类，实现Cloneable接口 
 * 声明一个克隆自身的接口
 * 
 * @author yangrun
 * @date 2018年11月27日
 */
public abstract class Prototype implements Cloneable {

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
