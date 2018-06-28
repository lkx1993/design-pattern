package com.mkmd.factoryMethod.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产IDCard的工厂，继承Factory抽象类
 * 
 * @author mahd
 *
 */
public class IdCardFactory extends Factory {
	// 存储注册用户集合
	private List owners = new ArrayList();

	/**
	 * 继承并实现生产产品的方法
	 */
	protected Product createProduct(String owner) {
		return new IdCard(owner);
	}

	/**
	 * 继承并实现注册产品的方法
	 */
	protected void registerProduct(Product product) {
		owners.add(((IdCard) product).getOwner());
	}

	/**
	 * 返回注册用户集合
	 * 
	 * @return
	 */
	public List getOwners() {
		return owners;
	}

}
