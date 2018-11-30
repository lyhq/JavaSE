package shk.lyhq.design.patterns.Adapter.Class;

/**
 * 适配器类，将 Source 的功能扩展到 Targetable里
 * 
 * @author yangrun
 * @date 2018年11月22日
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
}
