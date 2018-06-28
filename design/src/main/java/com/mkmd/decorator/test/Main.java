package com.mkmd.decorator.test;

public class Main {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();

	}

}
