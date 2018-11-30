package shk.lyhq.design.patterns.Composite.Nonstandard;

import java.util.ArrayList;
import java.util.List;

/**
 * 树节点：组合模式，将对象组合成树形结构以表示"部分-整体"的层次结构
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class TreeNode {

	private String name;// 节点名字

	private TreeNode parent;// 父节点

	private List<TreeNode> children = new ArrayList<TreeNode>();//子节点

	public TreeNode(String name) {
		this.name = name;
	}

	/**
	 * 添加子节点
	 */
	public void add(TreeNode treeNode) {
		children.add(treeNode);
	}
	
	/**
	 * 删除子节点
	 */
	public void remove(TreeNode treeNode) {
		if (children.size() > 0) {
			children.remove(treeNode);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	
}
