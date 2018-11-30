package shk.lyhq.design.patterns.Bridge;

/**
 * 定义一个桥，持有 Sourceable 的一个实例
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public abstract class Bridge {

	private Sourceable source;

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

	// 目标方法
	public void method() {
		source.method();
	}
}
