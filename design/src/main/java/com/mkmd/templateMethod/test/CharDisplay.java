package com.mkmd.templateMethod.test;

public class CharDisplay extends AbstractDisplay {// CharDisplay是AbstractDisplay的子类
	private char ch;// 需要显示的字符

	public CharDisplay(char ch) {// 构造函数中接收的字符被保存在字段中
		this.ch = ch;
	}

	public void open() {// open在父类中是抽象方法，在此处被重写
		System.out.print("<<");// 显示开始字符<<
	}

	public void print() {// 同样的此处重写print方法，该方法会在display中被重复调用
		System.out.print(ch);// 显示被保存在字段中的字符
	}

	public void close() {// 同样此处重写close方法
		System.out.println(">>");// 显示结束字符>>
	}

}
