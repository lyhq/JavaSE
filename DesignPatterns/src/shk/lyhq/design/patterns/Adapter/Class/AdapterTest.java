package shk.lyhq.design.patterns.Adapter.Class;

/**
 * 适配器模式
 * 
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
 * 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 * 
 * 以下是类的适配器模式
 * 
 * 核心思想就是：
 * 	有一个 Source 类，拥有一个方法，待适配，目标接口是 Targetable，通过 Adapter 类，
 * 	将 Source 的功能扩展到 Targetable 里。
 * 
 * 测试类
 * 
 * 输出：
 * 	this is original method!
 * 	this is the targetable method!
 * 	这样 Targetable 接口的实现类就具有了 Source 类的功能。
 * 	也就是客户端只要实现Targetable接口，就可以获得想要的功能。
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
