package com.mkmd.chainOfResponsibility.test;

public class SpecialSupport extends Support {
	private int specialNumber;// 特殊号码

	public SpecialSupport(String name, int specialNumber) {
		super(name);
		this.specialNumber = specialNumber;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == specialNumber) {// 支处理特殊号码的问题
			return true;
		} else {
			return false;
		}
	}

}
