package shk.lyhq.design.patterns.Iterator;

/**
 * 定义迭代器，用于操作集合
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public interface Iterator {

	//将指针移动到第一个
	Object first();
	
	//将指针移动到最后一个
	Object last();
	
	// 是否存在下一个
	public boolean hasNext();

	public Object next();

	// 是否存在上一个
	public boolean hasPrev();

	public Object prev();
}
