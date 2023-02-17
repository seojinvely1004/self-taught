package com.in28minutes.opps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		// 클래스의 메서드는 해당 클래스의 모든 객체에 의해 작동할 수 있다.
		ducati.start();
		honda.start();

	}

}
