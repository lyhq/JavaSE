package com.lyhq.design.patterns.Interpreter;

/**
 * 非终结符表达式，解释减法
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Minus extends AbstractExpression {

	private AbstractExpression left, right;

	public Minus(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Minus) {
			return left.equals(((Minus) obj).left) && right.equals(((Minus) obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public int interpret(Context ctx) {
		return left.interpret(ctx) - right.interpret(ctx);
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " - " + right.toString() + ")";
	}

}
