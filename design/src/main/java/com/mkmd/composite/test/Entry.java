package com.mkmd.composite.test;

/**
 * 目录抽象类：目录下有文件和文件夹
 * 
 * @author mahd
 *
 */
public abstract class Entry {
	public abstract String getName();// 获取名称

	public abstract int getSize();// 获取大小

	public Entry add(Entry entry) throws FileTreatMentException {// 加入目录条目
		throw new FileTreatMentException();
	}

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
