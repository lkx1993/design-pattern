package com.mkmd.strategy.test;

/**
 * 根据输入 来决定具体的策略实现类
 * 
 * @author mahd
 *
 */
public class Main {

	public static void main(String[] args) {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}

}
