package com.chitkara.oops;

class Engine1 {
	String typeString;

	public Engine1(String type) {
		this.typeString = type;
		System.out.println("Engine is inserted...");
	}

	void ignite() {
		System.out.println("engine is running...");
	}
}

class MusicSystem1 {
	String brandString;

	public MusicSystem1(String brand) {
		this.brandString = brand;
	}

	void play() {
		System.out.println("Music is being played...");
	}
}

class Maruti {
	String nameString;

	Engine1 egEngine;

	MusicSystem1 msMusicSystem;

	// Composition
	public Maruti(String nameString, String type) {
		this.nameString = nameString;
		this.egEngine = new Engine1(type);
	}

	// Aggregation
	void installMusicSystem(MusicSystem1 ms) {
		this.msMusicSystem = ms;
		System.out.println("Installing Music System...");
	}

}

//class Swift extends Maruti{
//
//	public Swift(String nameString, String type) {
//		super(nameString, type);
//		System.out.println("Swift is created...");
//	}
//	
//}

public class Demo {

	public static void main(String[] args) {
		MusicSystem1 msMusicSystem1 = new MusicSystem1("sony");

		Maruti maruti = new Maruti("swift", "1.2l petrol");

		maruti.installMusicSystem(msMusicSystem1);
	}

}
