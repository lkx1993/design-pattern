package com.mkmd.iterator.test;

/**
 * 书类，通过getName和setName来获取和赋予书的名称
 * 
 * @author mahd
 *
 */
public class Book {
	/**
	 * 书名
	 */
	private String name;

	/**
	 * 通过书名创建书
	 * 
	 * @param name
	 */
	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
