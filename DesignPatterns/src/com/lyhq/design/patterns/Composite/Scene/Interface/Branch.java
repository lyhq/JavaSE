package com.lyhq.design.patterns.Composite.Scene.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * 实际的树枝，实现树枝接口
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Branch implements IBranch {

	private String name;

	private List<ITreeNode> childrenList = new ArrayList<ITreeNode>();

	public Branch(String name, List<ITreeNode> childrenList) {
		super();
		this.name = name;
		this.childrenList = childrenList;
	}

	public Branch(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getInfo() {
		return "树枝->" + name;
	}

	@Override
	public void addChildren(ITreeNode treeNode) {
		childrenList.add(treeNode);
	}

	@Override
	public void removeChildren(ITreeNode treeNode) {
		if (childrenList.size() > 0) {
			childrenList.remove(treeNode);
		}
	}

	@Override
	public List<ITreeNode> getChildren() {
		return childrenList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
