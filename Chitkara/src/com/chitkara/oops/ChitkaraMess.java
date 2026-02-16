package com.chitkara.oops;

/*
 * 1. Encapsulation: The "Mess Food" Gatekeeper (2 Mins)
Scenario: The Mess serves food, but we need to check the qualityLevel 
before a student eats it.

The Code Concept: Make messFoodQuality a private variable.

The Activity: Ask students: "If the quality is < 3, 
the eat() method should return 'Order from Zomato instead'. 
How do we protect this variable?"

Lesson: We don't let students set the quality; 
only the Mess Manager (the Class) can.

 */
public class ChitkaraMess {
	private int messFoodQuality = 2;

	public void eat() {
		if (messFoodQuality < 3) {
			System.out.println("Order from Zomato instead");
		} else {
			System.out.println("Accha hai khana , aaj khalo , " + "kyo ki messFoodQuality: " + messFoodQuality);
		}
	}

	void setQuality(int q) {
		if (messFoodQuality > 0)
			this.messFoodQuality = q;
	}

}
