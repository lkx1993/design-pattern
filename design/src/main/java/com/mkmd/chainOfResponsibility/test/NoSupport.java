package com.mkmd.chainOfResponsibility.test;

public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	protected boolean resolve(Trouble trouble) {
		return false;// 不处理任何问题
	}

}
