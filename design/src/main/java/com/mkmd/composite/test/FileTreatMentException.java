package com.mkmd.composite.test;

/**
 * 自定义异常类
 * 
 * @author mahd
 *
 */
public class FileTreatMentException extends RuntimeException {
	public FileTreatMentException() {

	}

	public FileTreatMentException(String msg) {
		super(msg);
	}

}
