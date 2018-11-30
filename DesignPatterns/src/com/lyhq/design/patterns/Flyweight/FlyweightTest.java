package com.lyhq.design.patterns.Flyweight;


/**
 * 享元模式
 * 运用共享技术有效地支持大量细粒度的对象。
 * 
 * 参与者
 * 1.Flyweight
 * 描述一个接口，通过这个接口flyweight可以接受并作用于外部状态。
 * 
 * 2.ConcreteFlyweight
 * 实现Flyweight接口，并为内部状态（如果有的话）增加存储空间。
 * ConcreteFlyweight对象必须是可共享的。它所存储的状态必须是内部的；即，它必须独立于ConcreteFlyweight对象的场景。
 * 
 * 3.UnsharedConcreteFlyweight
 * 并非所有的Flyweight子类都需要被共享。Flyweight接口使共享成为可能，但它并不强制共享。
 * 在Flyweight对象结构的某些层次，UnsharedConcreteFlyweight对象通常将ConcreteFlyweight对象作为子节点。
 * 
 * 4.FlyweightFactory
 * 创建并管理flyweight对象。确保合理地共享flyweight。
 * 当用户请求一个flyweight时，FlyweightFactory对象提供一个已创建的实例或者创建一个（如果不存在的话）。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class FlyweightTest {

	public static void main(String[] args) {
		Flyweight fly1 = FlyweightFactory.getFlyweight("a");
		fly1.action(1);

		Flyweight fly2 = FlyweightFactory.getFlyweight("a");
		System.out.println(fly1 == fly2);

		Flyweight fly3 = FlyweightFactory.getFlyweight("b");
		fly3.action(2);

		Flyweight fly4 = FlyweightFactory.getFlyweight("c");
		fly4.action(3);

		Flyweight fly5 = FlyweightFactory.getFlyweight("d");
		fly5.action(4);

		System.out.println("池中对象个数：" + FlyweightFactory.getSize());
		
	}
}
