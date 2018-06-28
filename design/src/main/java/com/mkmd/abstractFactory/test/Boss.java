package com.mkmd.abstractFactory.test;

/**
 * 工厂方法模式
 * 
 * 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。
 * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。
 * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
 * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
 * 
 * @author mahd
 *
 */
// 抽象产品
abstract class Car {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// 具体产品
class Benz extends Car {
	public void drive() {
		System.out.println(this.getName() + "----go-----------------------");
	}
}

class Bmw extends Car {
	public void drive() {
		System.out.println(this.getName() + "----go-----------------------");
	}
}

// 抽象工厂
abstract class Driver {
	public abstract Car createCar(String car) throws Exception;
}

// 具体工厂（每个具体工厂负责一个具体产品）
class BenzDriver extends Driver {
	public Car createCar(String car) throws Exception {
		return new Benz();
	}
}

class BmwDriver extends Driver {
	public Car createCar(String car) throws Exception {
		return new Bmw();
	}
}

// 老板
public class Boss {

	public static void main(String[] args) throws Exception {
		Driver d = new BenzDriver();
		Car c = d.createCar("benz");
		c.setName("benz");
		c.drive();
	}
}