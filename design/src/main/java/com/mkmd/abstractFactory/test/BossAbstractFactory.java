package com.mkmd.abstractFactory.test;

/**
 * 抽象工厂模式
 * 
 * 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。
 * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。
 * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
 * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
 * 
 * 而且使用抽象工厂模式还要满足以下条件： 1.系统中有多个产品族，而系统一次只可能消费其中一族产品 2.同属于同一个产品族的产品以其使用。
 * 
 * @author mahd
 *
 */
// 抽象产品（Bmw和Audi同理）
abstract class BenzCar {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// 具体产品（Bmw和Audi同理）
class BenzSportCar extends BenzCar {
	public void drive() {
		System.out.println(this.getName() + "----BenzSportCar-----------------------");
	}
}

class BenzBusinessCar extends BenzCar {
	public void drive() {
		System.out.println(this.getName() + "----BenzBusinessCar-----------------------");
	}
}

abstract class BmwCar {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class BmwSportCar extends BmwCar {
	public void drive() {
		System.out.println(this.getName() + "----BmwSportCar-----------------------");
	}
}

class BmwBusinessCar extends BmwCar {
	public void drive() {
		System.out.println(this.getName() + "----BmwBusinessCar-----------------------");
	}
}

abstract class AudiCar {
	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class AudiSportCar extends AudiCar {
	public void drive() {
		System.out.println(this.getName() + "----AudiSportCar-----------------------");
	}
}

class AudiBusinessCar extends AudiCar {
	public void drive() {
		System.out.println(this.getName() + "----AudiBusinessCar-----------------------");
	}
}

// 抽象工厂
abstract class Driver3 {
	public abstract BenzCar createBenzCar(String car) throws Exception;

	public abstract BmwCar createBmwCar(String car) throws Exception;

	public abstract AudiCar createAudiCar(String car) throws Exception;
}

// 具体工厂
class SportDriver extends Driver3 {
	public BenzCar createBenzCar(String car) throws Exception {
		return new BenzSportCar();
	}

	public BmwCar createBmwCar(String car) throws Exception {
		return new BmwSportCar();
	}

	public AudiCar createAudiCar(String car) throws Exception {
		return new AudiSportCar();
	}
}

class BusinessDriver extends Driver3 {
	public BenzCar createBenzCar(String car) throws Exception {
		return new BenzBusinessCar();
	}

	public BmwCar createBmwCar(String car) throws Exception {
		return new BmwBusinessCar();
	}

	public AudiCar createAudiCar(String car) throws Exception {
		return new AudiBusinessCar();
	}
}

// 老板
public class BossAbstractFactory {

	public static void main(String[] args) throws Exception {

		Driver3 d = new BusinessDriver();
		AudiCar car = d.createAudiCar("");
		car.drive();
	}
}