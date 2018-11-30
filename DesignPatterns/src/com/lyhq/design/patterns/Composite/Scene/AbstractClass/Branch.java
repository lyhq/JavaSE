package com.lyhq.design.patterns.Composite.Scene.AbstractClass;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Branch extends TreeNode {
	// 存储子节点的信息
	private List<TreeNode> childrenList = new ArrayList<TreeNode>();

	// 构造函数是必须 的
	public Branch(String name) {
		super(name);
	}

	// 增加一个节点，可能 是树枝，也可能是个树叶
	public void addChildren(TreeNode treeNode) {
		this.childrenList.add(treeNode);
	}

	// 删除一个节点，可能 是树枝，也可能是个树叶
	public void removeChildren(TreeNode treeNode) {
		if (this.childrenList.size() > 0) {
			this.childrenList.remove(treeNode);
		}
	}

	// 我有哪些子节点
	public List<TreeNode> getChildren() {
		return this.childrenList;
	}
}
