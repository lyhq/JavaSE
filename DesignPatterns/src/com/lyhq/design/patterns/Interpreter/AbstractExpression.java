package com.lyhq.design.patterns.Interpreter;

/**
 * 抽象表达式
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public abstract class AbstractExpression {
	/**
	 * 以环境为准，本方法解释给定的任何一个表达式
	 */
	public abstract int interpret(Context ctx);

	/**
	 * 检验两个表达式在结构上是否相同
	 */
	public abstract boolean equals(Object obj);

	/**
	 * 返回表达式的hash code
	 */
	public abstract int hashCode();

	/**
	 * 将表达式转换成字符串
	 */
	public abstract String toString();
}
