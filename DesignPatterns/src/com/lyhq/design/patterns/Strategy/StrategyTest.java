package com.lyhq.design.patterns.Strategy;

/**
 * 策略模式
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 * 本模式使得算法可独立于使用它的客户而变化。
 * 
 * 参与者
 * 1.Strategy 定义所有支持的算法的公共接口。Context使用这个接口来调用某ConcreteStrategy定义的算法。
 * 2.ConcreteStrategy 以Strategy接口实现某具体算法。
 * 3.Context 用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Stategy访问它的数据。
 * 
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
 * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年12月4日
 */
public class StrategyTest {

	public static void main(String[] args) {
		Context context = new Context(new StrategyA());
		context.doMethod();
		
		context = new Context(new StrategyB());
		context.doMethod();
		
		context = new Context(new StrategyC());
		context.doMethod();
	}
}
