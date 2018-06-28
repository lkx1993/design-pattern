package com.mkmd.memento.test;

/**
 * 资源备忘状态
 * 
 * @author mahd
 *
 */
public class Memento {
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
