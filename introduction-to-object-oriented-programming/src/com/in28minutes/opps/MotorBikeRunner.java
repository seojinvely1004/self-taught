package com.in28minutes.opps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		// 클래스의 메서드는 해당 클래스의 모든 객체에 의해 작동할 수 있다.
		ducati.start();
		honda.start();

		// MotorBike.speed; ERROR)인스턴스변수는 개체로부터 참조될 수 없다
		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.setSpeed(20);
		honda.setSpeed(0);
	}

}
