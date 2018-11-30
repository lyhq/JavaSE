package shk.lyhq.design.patterns.Bridge;

/**
 * 具体的接口实现类1
 * @author yangrun
 * @date 2018年11月28日
 */
public class SourceSub1 implements Sourceable {

	@Override
	public void method() {
		System.out.println("this is the first SourceSub...");
	}

}
