package shk.lyhq.design.patterns.Adapter.Object;

/**
 * 适配器模式
 * 
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
 * 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 * 
 * 以下是对象的适配器模式
 * 
 * 核心思想就是：
 * 	基本思路和类的适配器模式相同，只是将 Adapter 类作修改，这次不继承 Source 类，而是持有 Source
 * 	类的实例，以达到解决兼容性的问题。
 * 
 * 测试类
 * @author yangrun
 * @date 2018年11月22日
 */
public class WrapperTest {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
