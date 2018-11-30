package shk.lyhq.design.patterns.Observer;

/**
 * 实现类1
 * 
 * @author Dream
 *
 */
public class Observer1 implements Observer {
	
	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}
}