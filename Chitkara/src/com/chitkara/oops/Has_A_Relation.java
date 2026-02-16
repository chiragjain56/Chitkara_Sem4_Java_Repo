package com.chitkara.oops;

//loose coupling and tight coupling 

//static and non static 
//new 
//is-A and has - A relation 

//1. COMPOSITION: An Engine cannot exist without a Car.
//class Engine {
//	String type;
//
//	Engine(String type) {
//		this.type = type;
//	}
//
//	void rev() {
//		System.out.println(type + " engine is revving...");
//	}
//}

////2. AGGREGATION: A Music System can exist independently (it's an accessory).
//class MusicSystem {
//	String brand;
//
//	MusicSystem(String brand) {
//		this.brand = brand;
//	}
//
//	void play() {
//		System.out.println("Playing music via " + brand);
//	}
//}
//
////Parent Class
//class TataCar {
//	String model;
//	// Composition: Created inside the constructor
//	private Engine engine;
//
//	// Aggregation: Passed from outside (Showroom/User)
//	private MusicSystem musicSystem;
//
//	TataCar(String model, String engineType) {
//		this.model = model;
////		this.engine = new Engine(engineType); // Composition
//
//	}
//
//	// Setter for Aggregation (Adding the accessory later)
//	void installMusicSystem(MusicSystem ms) {
//		this.musicSystem = ms;
//	}
//
//	void startCar() {
//		System.out.println("\n--- " + model + " Status ---");
//		engine.rev();
//		if (musicSystem != null) {
//			musicSystem.play();
//		} else {
//			System.out.println("No music system installed.");
//		}
//	}
//}
//
////3. INHERITANCE (Is-A Relationship)
//class Altroz extends TataCar {
//	Altroz() {
//		super("Altroz", "1.2L Diesal");
//	}
//}
//
//class Punch extends TataCar {
//	Punch() {
//		super("Punch", "1.2L Petrol");
//	}
//}
//
//public class Has_A_Relation {
//	public static void main(String[] args) {
//		// Create an independent Music System (Aggregation)
//		MusicSystem harman = new MusicSystem("Harman Kardon");
//
//		// Inheritance + Composition
//		Altroz myAltroz = new Altroz();
//
//		// Linking Aggregation
//		myAltroz.installMusicSystem(harman);
//
//		myAltroz.startCar();
//
//		// Another example without the music system
//		Punch myPunch = new Punch();
//		myPunch.startCar();
//
//		// Proving Aggregation: Even if myAltroz is set to null,
//		// the 'harman' object still exists in memory!
//	}
//}

//=================================================================================================
////1. COMPOSITION: An Engine cannot exist without a Car.
//class Engine {
//	String type;
//
//	public Engine(String type) {
//
//		this.type = type;
//	}
//
//	void Rev() {
//		System.out.println("engine is revving....");
//	}
//}

//2. AGGREGATION: A Music System can exist independently (it's an accessory).
//class MusicSystem {
//	String brandString;
//
//	void play() {
//		System.out.println("Song is being played...");
//	}
//}
//
//class Tata {
//	String modal;
//	private Engine eg;
//	private MusicSystem musicSystem;
//
////	// composition
//	public Tata(String mo, String engin) {
//		this.modal = mo;
//		this.eg = new Engine(engin);
//	}
//
//	// Setter for Aggregation (Adding the accessory later)
//	void installMusicSystem(MusicSystem ms) {
//		this.musicSystem = ms;
//		System.out.println("installed...doron doron");
//	}
//}

// Is_A relation 
//class Altroz extends Tata {
//	String modal;
//	private Engine eg;
//
//	Altroz() {
////		this.modal = modalString;
////		this.eg = new Engine(type);
//		super("Altroz", "1.2L Diesal");
//	}
//}

//// Is_A relation
//class Punch extends Tata {
//	public Punch() {
//		super("Punch ", "1.2L Petrol");
//	}
//}
//
//class Main10 {
//	public static void main(String[] args) {
//		MusicSystem ms = new MusicSystem();
//		Altroz altroz = new Altroz();
//
//		altroz.installMusicSystem(ms);
//
//		Punch punch = new Punch();
//
//	}
//}

//G10

//class Engine {
//	String type;
//
//	public Engine(String type) {
//		this.type = type;
//	}
//
//	void Rev() {
//		System.out.println("Engine is revving...");
//	}
//}
//
//class MusicSystem {
//	String brand;
//
//	public MusicSystem(String brand1) {
//		this.brand = brand1;
//	}
//
//	void play() {
//		System.out.println("Music is being played...");
//	}
//}
//
//class TataCar {
//	String modal;
//
//	Engine engine;
//
//	MusicSystem musicSystem;
//
//	// Compostion <> Strong relation with Car
//	public TataCar(String modalName, String type) {
//		this.modal = modalName;
//		this.engine = new Engine(type);
//		System.out.println("Engine is already in car " + engine.type);
//	}
//
//	// Aggregation <> weak relation with Car
//	void installMusicSystem(MusicSystem ms) {
//		this.musicSystem = ms;
//		System.out.println("Successfully install music System" + ms.brand);
//	}
//}
//
//class Main11 {
//	public static void main(String[] args) {
//		TataCar tataCar = new TataCar("base", "1.2l Diesal");
//		TataCar tataCar1 = new TataCar("Pure", "Hybrid");
//
////		tataCar = null;
//
//		MusicSystem ms = new MusicSystem("Jbl");
//		tataCar.installMusicSystem(new MusicSystem("Sony"));
//		tataCar1.installMusicSystem(ms);
//	}
//
//}

//G06
class Engine {
	String typeString;

	public Engine(String thpe) {
		this.typeString = thpe;
	}

	void Rev() {
		System.out.println("Engine is running...");
	}
}

class MusicSystem {
	String brandString;

	public MusicSystem(String brandStrin) {
		this.brandString = brandStrin;
	}

	void play() {
		System.out.println("Music is being played ...");
	}
}

class TataCar {
	String modalString;

	Engine engine;

	MusicSystem mSystem;

	// Composition
	public TataCar(String modString, String type) {
		this.modalString = modString;
		this.engine = new Engine(type);
		System.out.println("Engine is inserted....");
	}

	// Aggregation
	void installedMusicSystem(MusicSystem ms) {
		this.mSystem = ms;
		System.out.println("Music System installed...");

	}

}

class Main12 {
	public static void main(String[] args) {
		TataCar tataCar = new TataCar("base", "1.2L Diesal");

		tataCar.installedMusicSystem(new MusicSystem("Sony"));
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i * j > 6)
					break;
				System.out.println(i + "," + j);
			}
		}

		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i * j > 6)
					break outer;
				System.out.println(i + "," + j);
			}
		}

	}
}
