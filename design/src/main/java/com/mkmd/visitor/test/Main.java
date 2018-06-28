package com.mkmd.visitor.test;

public class Main {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();// 访问者接口多态--数据处理的实现
		Subject sub = new MySubject();// 资源接口多态--数据结构的实现
		sub.accept(visitor);// 数据资源接受数据处理
		visitor.visit(sub);// 数据处理访问数据结构

	}

}
