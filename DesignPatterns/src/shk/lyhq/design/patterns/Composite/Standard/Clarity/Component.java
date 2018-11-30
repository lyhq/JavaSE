package shk.lyhq.design.patterns.Composite.Standard.Clarity;

import java.util.List;

/**
 * Component抽象构件角色：定义参加组合对象的共有方法和属性，可以定义一些默认的行为或属性， 比如我们例子中的getInfo就封装到了抽象类中
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public abstract class Component {
	// 个体和整体都具有的共享
	public void doSomething() {
		// 编写业务逻辑
		System.out.println("Component...doSomething...");
	}

	// 增加一个叶子构件或树枝构件
	public abstract void add(Component component);

	// 删除一个叶子构件或树枝构件
	public abstract void remove(Component component);

	// 获得分支下的所有叶子构件和树枝构件
	public abstract List<Component> getChildren();
}
