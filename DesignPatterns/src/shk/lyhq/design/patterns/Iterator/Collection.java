package shk.lyhq.design.patterns.Iterator;

/**
 * 集合接口，定义集合的常用操作
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public interface Collection {

	//迭代器
	Iterator iterator();
	
	//获取元素
	Object get(int index);
	
	//获取集合元素个数
	int size();
	
	//增加元素
	void add(Object object);
	
	//移除元素
	//public void remove();
}
