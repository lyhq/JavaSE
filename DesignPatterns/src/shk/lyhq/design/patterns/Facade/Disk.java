package shk.lyhq.design.patterns.Facade;

/**
 * Disk类，子系统
 * 
 * @author yangrun
 * @date 2018年11月29日
 */
public class Disk {

	public void startUp() {
		System.out.println("disk start up...");
	}

	public void shutdown() {
		System.out.println("disk shutdown...");
	}
}
