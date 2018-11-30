package com.lyhq.design.patterns.Command;

/**
 * 命令的发出者
 * 
 * @author yangrun
 * @date 2018年11月30日
 */
public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	// 发布命令
	public void execute() {
		command.execute();
	}
}
