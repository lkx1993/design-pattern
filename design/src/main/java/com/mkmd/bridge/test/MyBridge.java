package com.mkmd.bridge.test;

public class MyBridge extends Bridge {
	public void method() {
		getSource().method();
	}
}
