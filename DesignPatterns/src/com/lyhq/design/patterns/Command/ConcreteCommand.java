package com.lyhq.design.patterns.Command;

/**
 * 具体的命令
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	/**
	 * 命令执行
	 */
	@Override
	public void execute() {
		this.receiver.receive();
	}

}
