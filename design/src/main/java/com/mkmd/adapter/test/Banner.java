package com.mkmd.adapter.test;

/**
 * 广告类
 * 
 * @author mahd
 *
 */
public class Banner {
	/**
	 * 广告语
	 */
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	/**
	 * 括号加
	 */
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	/**
	 * 星号加
	 */
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}

}
