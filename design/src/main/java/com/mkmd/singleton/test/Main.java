package com.mkmd.singleton.test;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Start---");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("s1与s2是相同的示例");
		} else {
			System.out.println("s1与s2不是相同的示例");
		}
		System.out.println("---End---");
	}

}
