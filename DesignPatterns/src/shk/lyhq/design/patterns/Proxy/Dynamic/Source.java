package shk.lyhq.design.patterns.Proxy.Dynamic;

/**
 * 被代理类
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Source implements Sourceable {

	@Override
	public void action() {
		System.out.println("我是被代理类，被执行了...");
	}

}
