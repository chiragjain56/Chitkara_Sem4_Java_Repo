package com.chitkara.task;

//final keyword: 

// 1. if i declare the class as a final , i can not extend or inherit from child class
// 2. if i define a method be final , i can not override it 
// 3. if i declare the variable final , i can not modify within the class also 

class Parent {

	static int age = 55;

	Parent() {
	}

	void walk() {

	}

}

class Child extends Parent {

	@Override
	void walk() {
		System.out.println(" child is walking ");
	}

	public static void main(String[] args) {
		Parent.age = 10;

		Parent p = new Parent();

		p.walk();
	}

}
