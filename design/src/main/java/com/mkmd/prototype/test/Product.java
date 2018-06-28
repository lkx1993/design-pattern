package com.mkmd.prototype.test;

/**
 * 产品类接口
 * 
 * @author mahd
 *
 */
public interface Product extends Cloneable {
	/**
	 * 抽象方法
	 * 
	 * @param s
	 */
	public abstract void use(String s);

	/**
	 * 克隆抽象方法
	 * 
	 * @return
	 */
	public abstract Product createClone();

}
