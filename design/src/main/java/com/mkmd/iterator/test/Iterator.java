package com.mkmd.iterator.test;

/**
 * 用于遍历集合中的元素
 * 
 * @author mahd
 *
 */
public interface Iterator {
	/**
	 * 判断是否存在下一个元素
	 * 
	 * @return
	 */
	public abstract boolean hasNext();

	/**
	 * 正确的返回下一个元素
	 * 
	 * @return
	 */
	public abstract Object next();

}
