package com.mkmd.adapter.test;

/**
 * 类适配器模式（使用继承的适配器）
 * 
 * @author mahd
 *
 */
public class Main {

	public static void main(String[] args) {
		// 类适配器模式（使用继承的适配器）
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();

		// 对象适配器模式（使用委托的适配器）
		Print2 p2 = new PrintBanner2(new Banner("Hello"));
		p2.printWeak();
		p2.printStrong();
	}

}
