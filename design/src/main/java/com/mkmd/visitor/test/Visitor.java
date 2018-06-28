package com.mkmd.visitor.test;

/**
 * 定义 访问者接口（数据处理类）
 * 
 * @author mahd
 *
 */
public interface Visitor {
	/**
	 * 访问接口方法（数据处理方法）
	 * 
	 * @param sub
	 */
	public void visit(Subject sub);
}
