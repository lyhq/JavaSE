package shk.lyhq.design.patterns.Adapter.Object;

/**
 * 目标接口
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public interface Targetable {

	/* 与原类中的方法相同 */
	public void method1();

	/* 新类的方法 */
	public void method2();
}