package shk.lyhq.design.patterns.Decorator;

/**
 * 被装饰的对象，被装饰类
 * @author yangrun
 * @date 2018年11月22日
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!被装饰者目标方法执行！");
	}
}