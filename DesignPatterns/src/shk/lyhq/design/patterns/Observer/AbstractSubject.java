package shk.lyhq.design.patterns.Observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	/**
	 * 增加观察者
	 */
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	/**
	 * 删除观察者
	 */
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	/**
	 * 通知所有的观察者
	 */
	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}
}
