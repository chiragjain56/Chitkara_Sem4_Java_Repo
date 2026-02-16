package com.chitkara.oops;

//public class Vehicle {

//	String brand = "GenricCar";
//
//	void horn() {
//		System.out.println("pee pee pee");
//	}
//}
//
//class Tata extends Vehicle {
//	void drive(String str) {
//		System.out.println("Car is driven !...." + str);
//	}
//
//	void drive(String str, String mode) {
//		System.out.println("Car is driven !...." + str + " " + mode);
//	}
//
//	@Override
//	void horn() {
////		super.horn();
//		System.out.println("Tata ka horn...");
//	}
//}
//
//class Altroz extends Tata {
//
//	@Override
//	void horn() {
//
//		System.out.println("Altroz is horning !...");
//	}
//}
//
//class Punch extends Tata {
//
//	@Override
//	void horn() {
//		System.out.println("Punch is horning !...");
//	}
//}
//
//class Main3 {
//	public static void main(String[] args) {
//		Tata vPunch = new Punch();
//
//		vPunch.drive("Punch");
//		vPunch.drive("Punch", "eco");
//		vPunch.horn();
//
//		Punch punch = new Punch();
//		punch.drive("Punch");
//		punch.drive("Punch", "eco");
//		vPunch.horn();
//
//	}
//}

//class Animal {
//	void eat() {
//		System.out.println("Animal eat...!");
//	}
//}

//class Dog extends Animal {
//	void eat() {
//		System.out.println("Dog eat...!");
//	}
//
//	void bark() {
//		System.out.println("Dog bark...!");
//	}
//}
//
//class Cat extends Animal {
//	void eat() {
//		System.out.println("cat eat...!");
//	}
//}
//
//class Main7 {
//	public static void main(String[] args) {
//		Animal animal1 = new Animal();
//		Animal animal = new Dog();
//		Animal animal2 = new Cat();
//
////		animal.bark();
//		if (animal instanceof Dog d) {
////			Dog d = (Dog) animal; // Manual explicit casting - repetitive! downcasting
////			((Dog) animal).bark();
//			d.bark();
//		}
//
//		animal.eat(); // Dog eat
//		animal2.eat(); // cat eat
//		animal1.eat(); // Animal eat
//	}
//}

// abstract means inherit from me so class can not be final
// Even without abstract methods,
// you can mark a class abstract to stop others from creating its objects.
// you can not create an object of an abstract class
// can not make a abstract method private and static

abstract class Car {
	int button;

	abstract void start();

	// abstract method should be implemented
	void stop() {
		System.out.println("fuel is empty");
	}

}

class AltrozChiragSir extends Car {

	@Override
	void start() {
		System.out.println("Insert the key , Gareeb");
	}

}

class AltrozPradeepSir extends Car {

	@Override
	void start() {
		System.out.println("Push the button, Welcome to showroom again...");
	}

}

class NexonMohit extends Car {

	String sunRoof;

	@Override
	void start() {
		System.out.println("strating from remote");

	}

}

class Main4 {
	public static void main(String[] args) {

		AltrozChiragSir altrozChiragSir = new AltrozChiragSir(); // parent-->childclass
		altrozChiragSir.start();
		altrozChiragSir.stop();

		System.out.println("===============");
		AltrozPradeepSir altrozPradeepSir = new AltrozPradeepSir();
		altrozPradeepSir.start();
		altrozPradeepSir.stop();

		System.out.println("===============");

		NexonMohit nMohit = new NexonMohit();
		nMohit.sunRoof = "Open";
		System.out.println(nMohit.sunRoof);
		nMohit.start();
		nMohit.stop();
	}
}

//class Car {
//	String nameOfCar = "Tata";
//	String modal;
//	int speed;
//
//	void drive(int s) {
//		System.out.println("Car is being driven at the speed : " + s);
//	}
//
//	void drive(int s, String name) {
//		System.out.println("Car name: " + name + s);
//	}
//
//	void drive(int s, String nameString, String modalString) {
//		System.out.println("Car with full spec: " + s + nameString + modalString);
//	}
//
//	public static void main(String[] args) {
//		Car car = new Car();
//		car.drive(100);
//		car.drive(120, "Altroz");
//		car.drive(140, "Harrier", "Adventure");
//	}
//}

//class Animal {
//	void eat() {
//		System.out.println("Animal can eat...!");
//	}
//}
//
//class Dog extends Animal {
//	void eat() {
//		System.out.println("Dog can eat...!");
//	}
//
//	void bark() {
//		System.out.println("Dog is bho bho...!");
//	}
//}
//
//class Cat extends Animal {
//
//	void eat() {
////		super.eat();
//		System.out.println("Cat can eat...!");
//	}
//}
//
//class Main7 {
//	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.eat();
//		Animal dogAnimal = new Dog();
//		dogAnimal.eat();
//		Animal catAnimal = new Cat();
//
//		if (dogAnimal instanceof Dog d) {
////			Dog d = (Dog) dogAnimal; // Manual explicit casting - repetitive! downcasting
////			((Dog) dogAnimal).bark();
//			d.bark();
//		}
//
//		catAnimal.eat();
//
//	}
//}

//class Hostel {
//	int noOfStudents = 500;
//
//	// Parent class constructor
//	public Hostel() {
//		this.noOfStudents = 20;
//		System.out.println("Calling Hostal Constructor :  !" + noOfStudents);
//	}
//
//	void rule(int n) {
//		System.out.println("In by 11 PM." + n);
//	}
//}
//
//class SquareOne extends Hostel {
//
//	public SquareOne() {
//		super();
//		System.out.println("Calling SquareOne Constructor : !");
//	}
//
//	void rule() {
//
//		super.noOfStudents = 400;
//		System.out.println(noOfStudents);
//		super.rule(10);
//
//		System.out.println("square one rule method ! ");
//	}
//}
//
//class Main7 {
//	public static void main(String[] args) {
//		SquareOne sOne = new SquareOne();
//		sOne.rule();
//
//	}
//}

//class Car {
//	String name;
//
//	void drive() {
//		System.out.println("Car is driving..."); // genric method
//	}
//}
//
//class Tata extends Car {
//	void drive() {
////		super.drive();
//		System.out.println("Tata is driven...!");
//	}
//
//	public static void main(String[] args) {
//		Tata tata = new Tata();
//		tata.name = "Punch";
//		System.out.println(tata.name);
//		tata.drive();
//		Maruti maruti = new Maruti();
//		maruti.name = "Victorius";
//		System.out.println(maruti.name);
//		maruti.drive();
//	}
//
//}
//
//class Maruti extends Car {
//	void drive() {
//		System.out.println("Maruti is driven...!");
//	}
//}
