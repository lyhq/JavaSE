package shk.lyhq.design.patterns.Composite.Scene.AbstractClass;

import java.util.List;

/**
 * 组合模式 将对象组合成树形结构以表示"部分-整体"的层次结构。"Composite使得用户对单个对象和组合对象的使用具有一致性。"
 * 
 * 测试类
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Client {
	public static void main(String[] args) {
		// 首先是组装一个组织结构出来
		Branch root = compositeTree();
		// 首先把tree(root)的信息打印出来
		System.out.println(root.getInfo());
		// 然后是所有员工信息
		System.out.println(getTreeInfo(root));
	}

	public static Branch compositeTree() {
		// 首先产生树根
		Branch root = new Branch("树根");
		// 把三个树干产生出来
		Branch trunkA = new Branch("树干A");
		Branch trunkB = new Branch("树干B");
		Branch trunkC = new Branch("树干C");
		// 再把三个树枝产生出来
		Branch branchA = new Branch("树枝A");
		Branch branchB = new Branch("树枝B");
		// 把所有的树叶都产生出来
		Leaf a = new Leaf("树叶a");
		Leaf b = new Leaf("树叶b");
		Leaf c = new Leaf("树叶c");
		Leaf d = new Leaf("树叶d");
		Leaf e = new Leaf("树叶e");
		Leaf f = new Leaf("树叶f");
		Leaf g = new Leaf("树叶g");
		Leaf h = new Leaf("树叶h");
		Leaf i = new Leaf("树叶i");
		Leaf j = new Leaf("树叶j");
		Leaf k = new Leaf("树叶k");
		Leaf l = new Leaf("树叶l");
		// 开始组装
		// 树根下有三个树干和一个叶子
		root.addChildren(trunkA);
		root.addChildren(trunkB);
		root.addChildren(trunkC);
		root.addChildren(k);
		// 树干A
		trunkA.addChildren(branchA);
		trunkA.addChildren(branchB);
		trunkA.addChildren(l);
		// 看看两个树枝下有什么
		branchA.addChildren(a);
		branchA.addChildren(b);
		branchA.addChildren(c);
		branchB.addChildren(d);
		branchB.addChildren(e);
		branchB.addChildren(f);
		// 再看树干B情况
		trunkB.addChildren(h);
		trunkB.addChildren(g);
		trunkB.addChildren(i);
		// 最后一个树干C
		trunkC.addChildren(j);
		return root;
	}

	// 遍历整棵树，只要给我根节点，我就能遍历出所有的节点
	public static String getTreeInfo(Branch root) {
		List<TreeNode> childrenList = root.getChildren();
		String info = "";
		String branchPre = "";
		String leafPre = "";
		for (int i = 0; i < childrenList.size(); i++) {
			branchPre += '-';
			leafPre += '-';
			TreeNode node = childrenList.get(i);
			if (node instanceof Branch) {
				info = info + branchPre + node.getInfo() + "\n" + getTreeInfo((Branch) node);
			} else {
				info = info + leafPre + node.getInfo() + "\n";
			}
		}

		return info;
	}
}
