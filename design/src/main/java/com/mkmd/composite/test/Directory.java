package com.mkmd.composite.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 目录实现类--文件夹
 * 
 * @author mahd
 *
 */
public class Directory extends Entry {
	private String name;

	private ArrayList directorys = new ArrayList();

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		int size = 0;
		Iterator it = directorys.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();

		}
		return size;
	}

	public Entry add(Entry entry) {
		directorys.add(entry);
		return this;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator it = directorys.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);

		}
	}

}
