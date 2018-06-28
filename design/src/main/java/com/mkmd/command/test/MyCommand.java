package com.mkmd.command.test;

/**
 * 命令实现类（携带执行结果）
 * 
 * @author mahd
 *
 */
public class MyCommand implements Command {

	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}
}
