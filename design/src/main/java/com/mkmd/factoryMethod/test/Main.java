package com.mkmd.factoryMethod.test;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IdCardFactory();
		Product pro1 = factory.create("小红");
		Product pro2 = factory.create("小明");
		Product pro3 = factory.create("小刚");
		pro1.use();
		pro2.use();
		pro3.use();
	}

}
