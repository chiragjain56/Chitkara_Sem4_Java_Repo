package com.chitkara.interfac;

//marker interface --> nothing allowed in the body --> can do relation
interface ACCoach {

}

//marker interface -->
interface VIP {

}

class GeneralPassanger {
	String nameSleeper;

	public GeneralPassanger(String name) {
		this.nameSleeper = name;
	}
}

class SecondACPassanger implements ACCoach {
	String nameSecondAC;

	public SecondACPassanger(String name) {
		this.nameSecondAC = name;
	}
}

class FirstACPassanger implements ACCoach, VIP {
	String nameFirstAC;

	public FirstACPassanger(String name) {
		this.nameFirstAC = name;
	}
}

class TrainServices {

	static void foodAndBlanket(Object x) {
		if (x instanceof ACCoach) {
			if (x instanceof VIP)
				System.out.println("Gale mai mala pahnao...");
			System.out.println("welcom to Ac coach..., give food , give blanket");
		} else {
			System.out.println("Please go to general coach...");
		}
	}

	public static void main(String[] args) {
		GeneralPassanger arunObjPassanger = new GeneralPassanger("Arun Sagwan");

		SecondACPassanger piyushACPassanger = new SecondACPassanger("Piyush Dua");

		FirstACPassanger pawniAcPassanger = new FirstACPassanger("Pawni");

		TrainServices.foodAndBlanket(arunObjPassanger);
		TrainServices.foodAndBlanket(piyushACPassanger);

		TrainServices.foodAndBlanket(pawniAcPassanger);
	}

}