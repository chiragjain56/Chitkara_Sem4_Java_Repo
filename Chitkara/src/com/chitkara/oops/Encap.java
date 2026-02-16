package com.chitkara.oops;

public class Encap {
	private int fuelLevel = 20;

	// setter method
	public void addFuelCapcity(int lit) {
		if (lit > 0)
			this.fuelLevel += lit;
		else {
			System.out.println("Enter the correct quantity or +ve amt");
		}
//		fuelLevel += lit;
	}

	// getter method
	public void getFuelCapacity() {
		System.out.println(fuelLevel);
	}
}

class Main {
	public static void main(String[] args) {
//		Encap en1 = new Encap();
//		en1.addFuelCapcity(10);
//		en1.getFuelCapacity();

		ChitkaraMess cMess = new ChitkaraMess();
		cMess.setQuality(4); // setter method
		cMess.eat(); // getter method

//		Encap en2 = new Encap(40);
//		System.out.println(en1 == en2);
//		System.out.println(en1.equals(en2));

	}
}
