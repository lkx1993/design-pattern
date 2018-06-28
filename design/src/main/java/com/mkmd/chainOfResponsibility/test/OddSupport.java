package com.mkmd.chainOfResponsibility.test;

public class OddSupport extends Support {

	public OddSupport(String name) {
		super(name);
	}

	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() % 2 == 1) {// 支处理号码为奇数的问题
			return true;
		} else {
			return false;
		}
	}

}
