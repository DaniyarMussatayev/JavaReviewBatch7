package com.syntax.class10;

public class TestInterface {
	public static void main(String[] args) {

		Bicycle bicycle = new Bicycle();

		bicycle.changeGear(12);
		bicycle.speedUp(25);
		bicycle.applybreak(4);

		bicycle.printState();
	}

}
