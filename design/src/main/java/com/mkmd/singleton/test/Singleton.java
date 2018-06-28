package com.mkmd.singleton.test;

/**
 * 单例模式类
 * 
 * @author mahd
 *
 */
public class Singleton {
	// 定义static修饰的字段singleton，并初始化为Singleton的示例，仅在该类被加载时创建一次
	private static Singleton singleton = new Singleton();

	/**
	 * 构造方法设为私有，不能在外部通过new来创建该类的示例
	 */
	private Singleton() {
		System.out.println("生成了一个Singleton示例");
	}

	// 获取Singleton的示例
	public static Singleton getInstance() {
		return singleton;

	}

}
