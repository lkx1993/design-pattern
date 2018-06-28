package com.mkmd.adapter.test;

/**
 * 适配器 将Print接口的弱化和强化与Banner类的括号和星号相适配
 * 
 * @author mahd
 *
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	/**
	 * 弱化与括号相配
	 */
	public void printWeak() {
		showWithParen();
	}

	/**
	 * 强化与括号相配
	 */
	public void printStrong() {
		showWithAster();
	}

}
