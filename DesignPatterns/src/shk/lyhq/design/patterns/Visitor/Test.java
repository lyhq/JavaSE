package shk.lyhq.design.patterns.Visitor;

/**
 * 访问者模式
 * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
 * 访问者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得容易。
 * 若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。
 * 访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。
 * 访问者模式将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。—— From 百科
 * 简单来说，访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，
 * 可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 * 
 * 该模式适用场景：如果我们想为一个现有的类增加新功能，不得不考虑几个事情：
 * 	1、新功能会不会与现有功能出现兼容性问题？
 * 	2、以后会不会再需要添加？
 * 	3、如果类不允许修改代码怎么办？
 * 		面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦。
 * 
 * 参与者
 * 1.Visitor 为该对象结构中ConcreteElement的每一个类声明一个Visit操作。
 * 该操作的名字和特征标识了发送Visit请求给该访问者的那个类。
 * 这使得访问者可以确定正被访问元素的具体的类。
 * 这样访问者就可以通过该元素的特定接口直接访问它。
 * 
 * 2.ConcreteVisitor
 * 实现每个由Visitor声明的操作。
 * 每个操作实现本算法的一部分，而该算法片断乃是对应于结构中对象的类。
 * ConcreteVisitor为该算法提供了上下文并存储它的局部状态。
 * 这一状态常常在遍历该结构的过程中累积结果。
 * 
 * 3.Element
 * 定义一个Accept操作，它以一个访问者为参数。
 * 
 * 4.ConcreteElement
 * 实现Accept操作，该操作以一个访问者为参数。
 * 
 * 5.ObjectStructure
 * 能枚举它的元素。
 * 可以提供一个高层的接口以允许该访问者访问它的元素。
 * 可以是一个复合或是一个集合，如一个列表或一个无序集合。
 * 
 * 测试类
 */
public class Test {

	public static void main(String[] args) {
		// 创建消费和收入单子
		Bill consumeBill = new ConsumeBill("消费", 3000);
		Bill incomeBill = new IncomeBill("收入", 5000);
		Bill consumeBill2 = new ConsumeBill("消费", 4000);
		Bill incomeBill2 = new IncomeBill("收入", 8000);
		// 添加单子
		BillManage billManage = new BillManage();
		billManage.addBill(consumeBill);
		billManage.addBill(incomeBill);
		billManage.addBill(consumeBill2);
		billManage.addBill(incomeBill2);

		// 创建访问者
		Boss boss = new Boss();
		CPA cpa = new CPA();

		// 接受访问者
		billManage.distributeVisitor(boss);
		billManage.distributeVisitor(cpa);
		// boss查看总收入和总消费
		boss.getTotalConsume();
		boss.getTotalIncome();

	}

}