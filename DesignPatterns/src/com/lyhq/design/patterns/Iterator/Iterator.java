package com.lyhq.design.patterns.Iterator;

/**
 * 迭代器接口
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public interface Iterator {

	//获取第一个元素
	Object first();
	
	//获取最后一个元素
	Object last();
	
	//是否有上一个元素
	boolean hasPrev();
	
	//获取上一个元素
	Object prev();
	
	//是否有下一个元素
	boolean hasNext();
	
	//获取下一个元素
	Object next();
}
