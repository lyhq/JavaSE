package com.lyhq.design.patterns.Iterator;

/**
 * 集合接口
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public interface Collection {

	//返回该集合的迭代器
	Iterator iterator();
	
	//获取元素
	Object get(int index);
	
	//获取元素个数
	int size();
	
	//增加元素
	void add(Object object);
}
