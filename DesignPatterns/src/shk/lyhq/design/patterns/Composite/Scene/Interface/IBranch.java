package shk.lyhq.design.patterns.Composite.Scene.Interface;

import java.util.List;

/**
 * 树枝接口，含主干树枝接口和分支树枝接口，定义一些树枝节点独有的属性方法
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public interface IBranch extends ITreeNode {

	//能够增加主干（树叶节点）或者是分支（树枝节点）—— 不管传什么都是向上造型
	void addChildren(ITreeNode treeNode);
	
	//能够移除主干（树叶节点）或者是分支（树枝节点）—— 不管传什么都是向上造型
	void removeChildren(ITreeNode treeNode);
	
	//获取子节点
	List<ITreeNode> getChildren();
}
