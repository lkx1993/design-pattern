package com.mkmd.prototype.test;

import java.util.HashMap;

/**
 * 产品注册、生产管理类
 * 
 * @author mahd
 *
 */
public class Manager {
	private HashMap showcase = new HashMap();

	/**
	 * 产品注册
	 * 
	 * @param name
	 * @param pro
	 */
	public void register(String name, Product pro) {
		showcase.put(name, pro);
	}

	/**
	 * 产品生产
	 * 
	 * @param proName
	 * @return
	 */
	public Product create(String proName) {
		Product pro = (Product) showcase.get(proName);
		return pro.createClone();

	}

}
