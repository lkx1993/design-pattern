package com.mkmd.factoryMethod.test;

/**
 * 生成产品的工厂
 * 
 * @author mahd
 *
 */
public abstract class Factory {
	/**
	 * 生产产品并注册后返回该产品
	 * 
	 * @param owner
	 * @return
	 */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	/**
	 * 生产产品的抽象方法，由子类实现
	 * 
	 * @param owner
	 * @return
	 */
	protected abstract Product createProduct(String owner);

	/**
	 * 注册产品的抽象方法，由子类实现
	 * 
	 * @param product
	 */
	protected abstract void registerProduct(Product product);
}
