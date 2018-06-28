package com.mkmd.abstractFactory.test;

import java.io.IOException;

/**
 * 简单工厂模式
 * 
 * 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，根据逻辑不同，产生具体的工厂产品。如例子中的Driver类。
 * 抽象产品角色：它一般是具体产品继承的父类或者实现的接口。由接口或者抽象类来实现。如例中的Car接口。
 * 具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现，如例子中的Benz、Bmw类。
 * 
 * @author mahd
 *
 */
// 抽象产品
abstract class Sedan {
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
class BenzSedan extends Sedan {
	public void drive() {
		System.out.println(this.getName() + "----go-----------------------");
	}
}

class BmwSedan extends Sedan {
	public void drive() {
		System.out.println(this.getName() + "----go-----------------------");
	}
}

// 简单工厂
class SedanDriver {
	public static Sedan createCar(String car) {
		Sedan c = null;
		if ("Benz".equalsIgnoreCase(car))
			c = new BenzSedan();
		else if ("Bmw".equalsIgnoreCase(car))
			c = new BmwSedan();
		return c;
	}
}

// 老板
public class BossSimplyFactory {

	public static void main(String[] args) throws IOException {
		// 老板告诉司机我今天坐奔驰
		Sedan car = SedanDriver.createCar("benz");
		car.setName("benz");
		// 司机开着奔驰出发
		car.drive();
	}
}
