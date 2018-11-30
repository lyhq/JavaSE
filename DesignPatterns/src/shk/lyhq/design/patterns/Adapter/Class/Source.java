package shk.lyhq.design.patterns.Adapter.Class;

/**
 * Source类，目标类，拥有一个方法method1，待适配，目标接口是 Targetable
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Source {

	public void method1() {
		System.out.println("this is original method!");
	}
}