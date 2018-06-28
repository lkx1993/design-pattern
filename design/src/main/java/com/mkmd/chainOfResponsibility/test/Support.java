package com.mkmd.chainOfResponsibility.test;

/**
 * 解决问题的抽象类
 * 
 * @author mahd
 *
 */
public abstract class Support {
	private String name;// 解决问题的实例的名字
	private Support next;// 要推卸给的对象

	public Support(String name) {// 生成解决问题实例
		this.name = name;
	}

	public Support setNext(Support next) {// 设置推卸责任对象
		this.next = next;
		return next;
	}

	public final void support(Trouble trouble) {// 解决问题步骤
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	public String toString() {// 显示字符串
		return "Support [name=" + name + "]";
	}

	protected abstract boolean resolve(Trouble trouble);// 解决问题的方法

	protected void done(Trouble trouble) {// 解决
		System.out.println(trouble + "is  resolved by " + this + ".");
	}

	protected void fail(Trouble trouble) {// 失败
		System.out.println(trouble + "can not be resolved.");
	}

}
