package shk.lyhq.design.patterns.Iterator;

/**
 * 具体的集合类
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class ConcreteCollection implements Collection {

	//底层用数组实现
	private Object[] collection = new Object[16];
	
	private int index = 0;
	
	private int size = 0;
	
	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public Object get(int index) {
		return collection[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(Object object) {
		collection[index++] = object;
		size++;
	}

}
