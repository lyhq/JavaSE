package com.lyhq.design.patterns.Interpreter;

/**
 * 终结符表达式，变量
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Variable extends AbstractExpression {

	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Variable) {
			return this.name.equals(((Variable) obj).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
    public int interpret(Context ctx) {
        return ctx.lookup(this);
    }

}
