package shk.lyhq.design.patterns.Decorator;

/**
 * 装饰的对象，装饰类
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}