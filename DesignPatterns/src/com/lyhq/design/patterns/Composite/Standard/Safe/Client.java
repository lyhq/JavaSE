package com.lyhq.design.patterns.Composite.Standard.Safe;

/**
 * 组合模式 （安全的组合模式，推荐使用）
 * 1.优点：
 * 	高层模块调用简单：一棵树形机构中的所有节点都是Component，局部和整体对调用者来说没有任何区别，
 * 	也就是说，高层模块不必关心自己处理的是单个对象还是整个组合结构，简化了高层模块的代码。
 * 	节点自由增加：使用组合模式后，如果想增加一个树枝节点、树叶节点都很容易，只要找到它的父节点就成，符合开闭原则。
 * 2. 缺点
 * 	看到在我们的场景类中定义，提到树叶和树枝使用时的定义了吗？直接使用了实现类！
 * 	这在面向接口编程上是很不恰当的，与依赖倒置原则冲突，读者在使用时要考虑清楚，它限制了你接口的影响范围。
 * 3. 使用用场景
 * 	1）维护和展示部分-整体关系的场景，如树形菜单、文件和文件夹管理。
 * 	2）从一个整体中能够独立出部分模块或功能的场景。
 * 4. 组合模式的注意事项
 * 只要是树形结构，就要考虑使用组合模式，这个一定要记住，只要是要体现局部和整体的关系的时候，
 * 而且这种关系还可能比较深，考虑一下组合模式吧。
 * 
 * 场景测试类
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个根节点
		Composite root = new Composite();
		root.doSomething();
		// 创建一个树枝构件
		Composite branch = new Composite();
		// 创建一个叶子节点
		Leaf leaf = new Leaf();
		// 建立整体
		root.add(branch);
		branch.add(leaf);
		
		//遍历树
		display(root);
	}

	// 通过递归遍历树
	public static void display(Composite root) {
		for (Component c : root.getChildren()) { // 叶子节点
			if (c instanceof Leaf) {
				c.doSomething();
			} else { // 树枝节点
				display((Composite) c);
			}
		}
	}
}
