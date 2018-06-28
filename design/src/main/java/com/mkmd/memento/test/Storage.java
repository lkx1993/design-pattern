package com.mkmd.memento.test;

/**
 * 备忘状态存储类
 * 
 * @author mahd
 *
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
