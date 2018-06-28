package com.mkmd.prototype.test;

public class Main {

	public static void main(String[] args) {
		// 准备
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox xbox = new MessageBox('/');
		// 注册
		manager.register("upen", upen);
		manager.register("mbox", mbox);
		manager.register("xbox", xbox);
		// 生成
		Product p1 = manager.create("upen");
		p1.use("Hello,World.");
		Product p2 = manager.create("mbox");
		p2.use("Hello,World.");
		Product p3 = manager.create("xbox");
		p3.use("Hello,World.");
	}

}
