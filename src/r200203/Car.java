package r200203;

public class Car {
	String color;
	int door;

	void drive() {
		System.out.println("Driving...");
	}

	void stop() {
		System.out.println("Stopped...");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren!");
	}
}