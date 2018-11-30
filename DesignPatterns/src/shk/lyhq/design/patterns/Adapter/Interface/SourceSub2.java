package shk.lyhq.design.patterns.Adapter.Interface;

/**
 * 真正的适配器类，继承抽象Wrapper，只需要实现想要的方法即可，不需要实现全部方法。
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class SourceSub2 extends Wrapper {
	public void method2() {
		System.out.println("the sourceable interface's second Sub2!");
	}
}