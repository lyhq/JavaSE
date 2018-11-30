package shk.lyhq.design.patterns.Command;

/**
 * 命令抽象基类
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public abstract class Command {

	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	// 命令的执行
	public abstract void execute();
}
