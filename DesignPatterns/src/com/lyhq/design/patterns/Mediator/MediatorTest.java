package com.lyhq.design.patterns.Mediator;

/**
 * 中介者模式
 * 
 * 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 
 * 适用者
 * 1.一组对象以定义良好但是复杂的方式进行通信。产生的相互依赖关系结构混乱且难以理解。
 * 2.一个对象引用其他很多对象并且直接与这些对象通信,导致难以复用该对象。
 * 3.想定制一个分布在多个类中的行为，而又不想生成太多的子类。
 * 
 * 参与者
 * 1.Mediator 中介者定义一个接口用于与各同事（Colleague）对象通信。
 * 2.ConcreteMediator 具体中介者通过协调各同事对象实现协作行为。 了解并维护它的各个同事。 
 * 3.Colleagueclass  每一个同事类都知道它的中介者对象， 每一个同事对象在需与其他的同事通信的时候，与它的中介者通信。
 * 
 * @author yangrun
 * @date 2018年12月3日
 */
public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague houseOwner = new HouseOwner();
		Colleague tenant = new Tenant();
		
		houseOwner.setMediator(mediator);
		tenant.setMediator(mediator);
		
		mediator.notice(houseOwner);
		mediator.notice(tenant);
	}
}
