package com.mkmd.factoryMethod.test;


/**
 * 产品的子类--ID卡
 * 
 * @author mahd
 *
 */
public class IdCard extends Product {
	// 定义产品用户的字段
	private String owner;

	public IdCard(String owner) {
		System.out.println("制作" + owner + "的ID卡");
		this.owner = owner;
	}

	// 继承并实现父类的抽象方法
	public void use() {
		System.out.println("使用" + owner + "的ID卡");
	}

	public String getOwner() {
		return owner;
	}

}
