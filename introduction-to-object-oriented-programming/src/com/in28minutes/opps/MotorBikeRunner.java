package com.in28minutes.opps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		// Ŭ������ �޼���� �ش� Ŭ������ ��� ��ü�� ���� �۵��� �� �ִ�.
		ducati.start();
		honda.start();

		// MotorBike.speed; ERROR)�ν��Ͻ������� ��ü�κ��� ������ �� ����
		ducati.speed = 100;
		honda.speed = 80;

		ducati.speed = 20;
		honda.speed = 0;

	}

}
