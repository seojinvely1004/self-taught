package com.in28minutes.opps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		// 클래스의 메서드는 해당 클래스의 모든 객체에 의해 작동할 수 있다.
		ducati.start();
		honda.start();

		// MotorBike.speed; ERROR)인스턴스변수는 개체로부터 참조될 수 없다
		ducati.speed = 100;
		honda.speed = 80;

		ducati.speed = 20;
		honda.speed = 0;

	}

}
