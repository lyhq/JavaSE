package com.lyhq.design.patterns.Composite.Scene.Interface;

/**
 * 树节点接口，是树枝节点和叶子节点都要继承的顶级接口
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public interface ITreeNode {

	/**
	 * 获取节点自己的信息，树枝和叶子共有的方法，抽取到顶级接口中
	 */
	String getInfo();
	
}
