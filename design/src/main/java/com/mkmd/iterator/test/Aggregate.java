package com.mkmd.iterator.test;

/**
 * 所要遍历所有集合的接口，实现该接口的类将成为一个可以保存多个元素的集合
 * 
 * @author mahd
 *
 */
public interface Aggregate {
	/**
	 * 获取用于遍历集合的迭代器
	 * 
	 * @return
	 */
	public abstract Iterator iterator();
}
