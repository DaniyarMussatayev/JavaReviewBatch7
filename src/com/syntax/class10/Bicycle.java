package com.syntax.class10;

public class Bicycle implements Vehicle{
	
	int gear;
	int speed; 
	@Override
	public void changeGear(int NewGear) {		
		gear=NewGear;
	}
	@Override
	public void speedUp(int spd) {
		speed+=spd;
	}
	@Override
	public void applybreak(int brk) {
		speed-=brk;
	}
	
	public void printState() {
		System.out.println("Current state of the Bicycle");
		System.err.println("Gear : "+gear);
		System.out.println("Speed : "+speed);
	}
}
