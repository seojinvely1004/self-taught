package com.in28minutes.opps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		// Ŭ������ �޼���� �ش� Ŭ������ ��� ��ü�� ���� �۵��� �� �ִ�.
		ducati.start();
		honda.start();

		// MotorBike.speed; ERROR)�ν��Ͻ������� ��ü�κ��� ������ �� ����
		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.setSpeed(20);
		honda.setSpeed(0);
	}

}
