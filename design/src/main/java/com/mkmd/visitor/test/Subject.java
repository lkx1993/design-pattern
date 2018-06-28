package com.mkmd.visitor.test;

/**
 * 定义 资源接口（数据结构类）
 * 
 * @author mahd
 *
 */
public interface Subject {
	/**
	 * 接受访问接口方法
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor);

	/**
	 * 获取数据结构方法
	 * 
	 * @return
	 */
	public String getSubject();
}
