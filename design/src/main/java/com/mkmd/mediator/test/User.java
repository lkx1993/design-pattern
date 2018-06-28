package com.mkmd.mediator.test;
/**
 * 实体抽象类
 * @author mahd
 *
 */
public abstract class User {

	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();
}
