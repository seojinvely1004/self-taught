package com.in28minutes.opps;

public class MotorBike {

	// state
	private int speed;// member variable

	// behaviour
	// method
	// inputs -int speed
	// outputs - void
	// name - setSpeed
	void setSpeed(int speed) {//local variable
		this.speed = speed;
		// System.out.println("speed");
		// System.out.println("this.speed");
		
	}
	void start() {
		System.out.println("Bike Start");

	}

}
