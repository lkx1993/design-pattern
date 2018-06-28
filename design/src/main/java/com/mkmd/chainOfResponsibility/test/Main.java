package com.mkmd.chainOfResponsibility.test;

public class Main {

	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support dinan = new LimitSupport("Dinan", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);
		// 形成责任链
		alice.setNext(bob).setNext(charlie).setNext(dinan).setNext(elmo).setNext(fred);
		// 制造各种问题
		for (int i = 0; i < 500; i += 33) {
			alice.support(new Trouble(i));

		}
	}

}
