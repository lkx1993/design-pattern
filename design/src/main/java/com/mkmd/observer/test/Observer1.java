package com.mkmd.observer.test;

/**
 * 观察者实现类1
 * 
 * @author mahd
 *
 */
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}
}
