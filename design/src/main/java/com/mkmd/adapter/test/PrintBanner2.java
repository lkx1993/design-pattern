package com.mkmd.adapter.test;

/**
 * 适配器 将Print接口的弱化和强化与Banner类的括号和星号相适配
 * 
 * @author mahd
 *
 */
public class PrintBanner2 extends Print2 {

	private Banner banner;

	public PrintBanner2(Banner banner) {
		this.banner = banner;
	}

	/**
	 * 弱化与括号相配
	 */
	public void printWeak() {
		banner.showWithParen();
	}

	/**
	 * 强化与括号相配
	 */
	public void printStrong() {
		banner.showWithAster();
	}

}
