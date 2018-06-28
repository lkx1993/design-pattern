package com.mkmd.builder.test;

/**
 * 文档内容
 * 
 * @author mahd
 *
 */
public class Director {
	private Bulider bulider;

	public Director(Bulider bulider) {
		this.bulider = bulider;
	}

	public void construct() {
		bulider.makeTitle("Greeting");// 标题
		bulider.makeString("从早上至中午");// 字符串
		bulider.makeItems(new String[] { "早上好。", "中午好。" });// 条目
		bulider.makeString("晚上");// 其他字符串
		bulider.makeItems(new String[] { "晚上好。", "晚安。", "再见。" });// 其他条目
		bulider.close();// 结束
	}

}
