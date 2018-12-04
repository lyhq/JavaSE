package shk.lyhq.design.patterns.Iterator;

/**
 * 具体的迭代器
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class ConcreteIterator implements Iterator {

	private Collection collection;

	// 索引
	private int pos = -1;

	public ConcreteIterator(Collection collection) {
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return pos < collection.size() - 1;
	}

	@Override
	public Object next() {
		if (pos < collection.size() - 1 && pos >= -1) {
			return collection.get(++pos);
		} else {
			return "越界...";
		}
	}

	@Override
	public boolean hasPrev() {
		return pos > 0;
	}

	@Override
	public Object prev() {
		if (pos > 0) {
			pos--;
			return collection.get(pos);
		} else {
			return "越界...";
		}
	}

	@Override
	public Object first() {
		pos = -1;
		return collection.get(pos+1);
	}

	@Override
	public Object last() {
		pos = collection.size() - 1;
		return collection.get(pos);
	}

}
