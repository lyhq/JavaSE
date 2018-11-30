package shk.lyhq.design.patterns.Bridge;

/**
 * 具体的桥接类
 * 
 * @author yangrun
 * @date 2018年11月28日
 */
public class ConcreteBridge extends Bridge {

	@Override
	public void method() {
		getSource().method();
	}
}
