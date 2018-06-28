package com.mkmd.strategy.test;

/**
 * 策略实现方法-减
 * 
 * @author mahd
 *
 */
public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}
