package com.lyhq.design.patterns.Composite.Scene.AbstractClass;

/**
 * TreeNode抽象类
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public abstract class TreeNode {

	// 树节点名称
	private String name = "";

	public TreeNode(String name) {
		this.name = name;
	}

	// 获取树节点信息
	public String getInfo() {
		return "名称:" + this.name;
	}

}
