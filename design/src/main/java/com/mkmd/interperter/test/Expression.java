package com.mkmd.interperter.test;

/**
 * 解释器接口
 * 
 * @author mahd
 *
 */
public interface Expression {
	public int interpret(Context context);
}