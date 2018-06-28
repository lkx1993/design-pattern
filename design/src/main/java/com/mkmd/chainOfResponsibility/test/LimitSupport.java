package com.mkmd.chainOfResponsibility.test;

public class LimitSupport extends Support {
	private int limit;// 限制题号

	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {// 支处理小于指定号码的问题
			return true;
		} else {
			return false;
		}
	}

}
