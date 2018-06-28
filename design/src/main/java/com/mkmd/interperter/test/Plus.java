package com.mkmd.interperter.test;

/**
 * 解释器实现类--加
 * 
 * @author mahd
 *
 */
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}
}