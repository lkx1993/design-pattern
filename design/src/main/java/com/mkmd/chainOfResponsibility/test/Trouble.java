package com.mkmd.chainOfResponsibility.test;

/**
 * 发生问题类
 * 
 * @author mahd
 *
 */
public class Trouble {
	private int number;// 问题编号

	public Trouble(int number) {
		this.number = number;
	}

	public int getNumber() {// 获取问题编号
		return number;
	}

	public String toString() {// 代表问题的字符串
		return "Trouble [number=" + number + "]";
	}

}
