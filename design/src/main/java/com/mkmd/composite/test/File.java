package com.mkmd.composite.test;

/**
 * 目录实现类--文件
 * 
 * @author mahd
 *
 */
public class File extends Entry {
	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}

}
