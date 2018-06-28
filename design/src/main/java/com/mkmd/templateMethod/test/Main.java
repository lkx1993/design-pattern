package com.mkmd.templateMethod.test;

public class Main {

	public static void main(String[] args) {
		// 生成一个持有'H'的CharDisplay的实例
		AbstractDisplay d1 = new CharDisplay('H');
		// 生成一个持有"Hello World"的StringDisplay的实例
		AbstractDisplay d2 = new StringDisplay("Hello World");
		// 生成一个持有"你好 世界"的StringDisplay的实例
		AbstractDisplay d3 = new StringDisplay("你好，世界。");
		d1.display();// 由于d1，d2，d3都是AbstractDisplay的子类，
		d2.display();// 可以调用继承的display方法
		d3.display();// 实际程序取决于CharDisplay和StringDisplay的具体实现
	}

}
