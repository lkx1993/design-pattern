package com.mkmd.visitor.test;

/**
 * 定义 访问者实现类
 * 
 * @author mahd
 *
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject：" + sub.getSubject());

	}

}
