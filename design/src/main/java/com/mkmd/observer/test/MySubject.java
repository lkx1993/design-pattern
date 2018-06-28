package com.mkmd.observer.test;

/**
 * 被观察者实体类
 * 
 * @author mahd
 *
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}