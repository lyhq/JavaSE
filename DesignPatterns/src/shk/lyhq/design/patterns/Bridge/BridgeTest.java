package shk.lyhq.design.patterns.Bridge;

/**
 * 桥接模式
 * 桥接模式就是把抽象部分和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是： 将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的 JDBC 桥 DriverManager 一样，JDBC 进行连接数据库的时候，
 * 在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，原因就是 JDBC提供统一接口，每个数据库提供各自的实现，
 * 用一个叫做数据库驱动的程序来桥接就行了。
 * 
 * 测试类
 * 
 * 通过对 Bridge 类的调用，实现了对接口 Sourceable 的实现类 SourceSub1 和 SourceSub2的调用。
 * Bridge_Drier.png图是我们 JDBC 连接的原理，就是使用桥接模式的。
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new ConcreteBridge();
		/* 调用第一个对象 */
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/* 调用第二个对象 */
		Sourceable source2 = new SourceSub2();

		bridge.setSource(source2);
		bridge.method();
	}
}