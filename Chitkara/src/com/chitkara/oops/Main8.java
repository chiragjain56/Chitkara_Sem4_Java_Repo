//package com.chitkara.oops;
//
////Method overloading <> static poly <> compile time poly
//
//class CalculateSum {
//
//	int sum = 0;
//
//	void add(int x) {
//		sum += x;
//		System.out.println(sum);// 5
//	}
//
//	void add(int a, int b) {
//		sum += a + b;
//		System.out.println(sum); // 10
//	}
//
//	void add(int a, int b, int c) {
//		sum += a + b + c;
//		System.out.println(sum); // 16
//	}
//}
//
////Method Overiding <> Dynamic Polymor <> Runtime PolyMorphisam
//
//class Animal {
//	String nameString;
//
//	void eat() {
//		System.out.println("Animal can eat...");
//	}
//}
//
//class Dog extends Animal {
//
//	// override
//	void eat() {
//		System.out.println("Dog can eat ... ");
//	}
//
//	void sound() {
//		System.out.println("bho bho bho....");
//	}
//
//}
//
//class Cat extends Animal {
//
//	// override
//	void eat() {
//		System.out.println("Cat can eat ...");
//	}
//
//	void sound() {
//		System.out.println("Meow Meow Meow...");
//	}
//
//}
//
//public class Main8 {
//
//	public static void main(String[] args) {
//
//		Animal animal = new Dog(); // upcast <> implicit
////		animal.eat();
//
//		Animal animal2 = new Cat();
//		if (animal instanceof Dog d) {
////			Dog d = (Dog) animal;
////			Dog d = (Dog) new Dog(); //downcast <> explicit
//			d.sound();
//		} else {
//			System.out.println("animal do not belong to Dog class ...");
//		}
//
////		animal2.eat();
//
//		if (animal2 instanceof Cat d) {
//			d.sound();
//		} else {
//			System.out.println("animal do not belong to Cat class ...");
//		}
//
//		CalculateSum calculateSum = new CalculateSum();
//		calculateSum.add(5);
//		calculateSum.add(2, 3);
//		calculateSum.add(1, 2, 3);
//		System.out.println(calculateSum.sum); // 16
//
//		System.out.println();
//	}
//}
