package com.chitkara.interfac;

/*
 * Feature, Before Java 8, After Java 8
 * 
 * Abstract Methods, Allowed, Allowed
 * 
 * Method Bodies, Impossible, Possible(via default)
 * 
 * Static Methods, Not Allowed, Allowed
 * 
 * Lambdas, No, Yes(Functional Interfaces)
 * 
 * private static Methods --> after java9 -->private static method is allowed
 */

// make a relation Can Do

// interface is used to get 100% abstraction and multiple inheritance

// you can create a default method and override it in the class

//we can not create an object of an interface so we can define the states of an obj.

interface Shape {
	String colorI = "Red"; // psf --> public static final

	void getArea(); // abstract method

	void getPerameter(); // abstract method

	default void toMake(String str) { // java 8
		if (validation(str))
			System.out.println("making a shape...");
		else {
			System.out.println("you are wrong person...");
		}
	}

	static void getMessage() { // java 8
		System.out.println("shape is created...");
		String s = new String("hello").intern();
	}

	private static boolean validation(String name) {
		if (name == "Chirag sir")
			return true;
		else {
			return false;
		}
	}

}

interface CreateToy {
	void createToy();
}

class Rectangle implements Shape, CreateToy {

	double length;
	double width;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	@Override
	public void getArea() {
		System.out.println(length * width);

	}

	@Override
	public void getPerameter() {
		System.out.println(2 * (length + width));

	}

	@Override
	public void createToy() {
		System.out.println("Toy is Being created...");
	}
}

class Circle implements Shape, CreateToy {
	double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createToy() {
		System.out.println("shape circle toy is created....");

	}

	@Override
	public void getArea() {
		System.out.println("Area of circle: ");
		System.out.println(Math.PI * Math.pow(radius, 2));

	}

	@Override
	public void getPerameter() {
		System.out.println("Perimeter of Circle: ");
		System.out.println(2 * Math.PI * radius);

	}

}

class Main20 {
	public static void main(String[] args) {
		Shape shape = new Rectangle(5.0, 10.0);
		shape.getArea();
		shape.getPerameter();
		shape.toMake("Manik");

		Shape shape1 = new Circle(5.5);
		shape1.getArea();
		shape1.getPerameter();

		CreateToy createToy = new Rectangle(5.0, 10.0);
		createToy.createToy();

		CreateToy createToy2 = new Circle();
		createToy2.createToy();

		System.out.println(Shape.colorI);

//		Engine egEngine = new Car();
//		egEngine.pushButton();
//		egEngine.stopEngine();
//
//		MusicSystem ms = new Car();
//		ms.stopMS();
	}
}

//interface Engine {
//void pushButton();
//
//void stopEngine();
//}
//
//interface MusicSystem {
//void pushButton();
//
//void stopMS();
//}

//class Car implements Engine, MusicSystem {
//
//@Override
//public void pushButton() {
//	System.out.println("Engine and MusicPlayer both started together...");
//
//}
//
//@Override
//public void stopMS() {
//	System.out.println("stop ms");
//
//}
//
//@Override
//public void stopEngine() {
//	System.out.println("stop engine...");
//
//}
//
//}