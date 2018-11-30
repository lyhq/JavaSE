package shk.lyhq.design.patterns.Facade;

/**
 * CPU类，子系统
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class CPU {

	public void startUp() {
		System.out.println("cpu start up...");
	}
	
	public void shutdown() {
		System.out.println("cpu shutdown...");
	}
}
