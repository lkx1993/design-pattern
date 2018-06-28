package com.mkmd.visitor.test;

/**
 * 定义 资源实现类
 * 
 * @author mahd
 *
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);// 资源接受访问者，访问者就可以直接访问资源
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
