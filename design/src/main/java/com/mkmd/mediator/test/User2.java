package com.mkmd.mediator.test;

/**
 * 实体类2
 * 
 * @author mahd
 *
 */
public class User2 extends User {

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");
	}
}
