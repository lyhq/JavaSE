package com.lyhq.design.patterns.Facade;

/**
 * 外观模式(Facade)
 * 外观模式是为了解决类与类之家的依赖关系的，像 spring 一样，可以将类和类之间的关系配置到配置文件中，
 * 而外观模式就是将他们的关系放在一个 Facade 类中，降低了类类之间的耦合度，该模式中没有涉及到接口.
 * 
 * 如果我们没有 Computer 类，那么，CPU、Memory、Disk 他们之间将会相互持有实例，产生关系，
 * 这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，这不是我们想要看到的，有了 Computer类，
 * 他们之间的关系被放在了 Computer 类里，这样就起到了解耦的作用，这，就是外观模式！
 * 
 * 外观模式的优点
 * ●　　松散耦合
 * 外观模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
 * ●　　简单易用
 * 外观模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟外观类交互就可以了。
 * ●　　更好的划分访问层次
 * 通过合理使用Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。
 * 把需要暴露给外部的功能集中到外观中，这样既方便客户端使用，也很好地隐藏了内部的细节
 * 
 * 测试类, 客户端
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class FacadeTest {

	public static void main(String[] args) {
		Computer computer = new Computer(new CPU(), new Memory(), new Disk());
		computer.startUp();
		computer.shutdown();
	}
}
