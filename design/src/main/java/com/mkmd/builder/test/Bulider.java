package com.mkmd.builder.test;

/**
 * 编写文档流程
 * 
 * @author mahd
 *
 */
public abstract class Bulider {
	/**
	 * 编写文档标题
	 * 
	 * @param title
	 */
	public abstract void makeTitle(String title);

	/**
	 * 编写文档内容
	 * 
	 * @param str
	 */
	public abstract void makeString(String str);

	/**
	 * 编写文档条目
	 * 
	 * @param items
	 */
	public abstract void makeItems(String[] items);

	/**
	 * 编写完成，关闭
	 */
	public abstract void close();
}
