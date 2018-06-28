package com.mkmd.command.test;

/**
 * 命令发出类类（携带命令）
 * 
 * @author mahd
 *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		command.exe();
	}
}
