package com.mkmd.proxy.test;

/**
 * 资源类
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
