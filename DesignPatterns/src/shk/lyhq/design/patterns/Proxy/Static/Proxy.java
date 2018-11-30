package shk.lyhq.design.patterns.Proxy.Static;

/**
 * 代理类，实现被代理类想要完成的任务
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Proxy implements Sourceable {

	private Source source;//被代理类实例

	public Proxy() {
		super();
		this.source = new Source();
	}

	//这个很像装饰者模式呀！跟装饰者模式一样的操作！
	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}