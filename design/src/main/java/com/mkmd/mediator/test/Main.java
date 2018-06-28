package com.mkmd.mediator.test;

public class Main {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();

	}

}
