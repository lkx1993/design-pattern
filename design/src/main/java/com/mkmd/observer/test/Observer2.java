package com.mkmd.observer.test;

/**
 * 观察者实现类2
 * 
 * @author mahd
 *
 */
public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}
}
