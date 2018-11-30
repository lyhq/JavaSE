package shk.lyhq.design.patterns.Observer;

/**
 * AbstractSubject的实现类
 * 
 * @author Dream
 *
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}