package com.mkmd.strategy.test;

/**
 * 策略实现方法-乘
 * 
 * @author mahd
 *
 */
public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}
}
