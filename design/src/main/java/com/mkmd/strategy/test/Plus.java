package com.mkmd.strategy.test;

/**
 * 策略实现方法-加
 * 
 * @author mahd
 *
 */
public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}
}
