package shk.lyhq.design.patterns.Command;

/**
 * 接收者，也就是命令的执行者
 * @author yangrun
 * @date 2018年11月30日
 */
public class Receiver {

	//接收命令，执行
	public void receive() {
		System.out.println("Receiver...receive...执行了命令");
	} 
}
