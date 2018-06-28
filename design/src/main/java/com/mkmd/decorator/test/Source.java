package com.mkmd.decorator.test;

/**
 * 被装饰类的实例
 * 
 * @author mahd
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");

	}

}
