package com.mkmd.templateMethod.test;

public class StringDisplay extends AbstractDisplay {// StringDisplay也是AbstractDisplay的子类
	private String string;// 需要显示的字符串
	private int width;// 以字节为单位计算出字符串的长度

	public StringDisplay(String string) {// 构造函数中接收的字符创被保存在字段中
		this.string = string;
		this.width = string.getBytes().length;// 同时字符串的字节长度也被保存在字段中
	}

	public void open() {// 重写open方法
		printLine();// 调用本类的printLine方法画线
	}

	public void print() {// print方法
		System.out.println("|" + string + "|");// 给保存在字段中的字符串前后加上"|",并显示出来

	}

	public void close() {// 重写close方法
		printLine();// 调用本类的printLine方法画线

	}

	private void printLine() {// 被open和close方法调用，本类私有方法，其他类不能调用
		System.out.print("+");// 显示方框角的+
		for (int i = 0; i < width; i++) {// 显示width个-，组成边框
			System.out.print("-");
		}
		System.out.println("+");// 显示方框角的+
	}

}
