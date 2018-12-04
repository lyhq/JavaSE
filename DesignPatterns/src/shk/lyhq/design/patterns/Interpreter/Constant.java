package shk.lyhq.design.patterns.Interpreter;

/**
 * 终结符表达式，常量
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Constant extends AbstractExpression {

	private int value;

	public Constant(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Constant) {
			return this.value == ((Constant) obj).value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public int interpret(Context ctx) {
		return value;
	}

	@Override
	public String toString() {
		return new Integer(value).toString();
	}

}
