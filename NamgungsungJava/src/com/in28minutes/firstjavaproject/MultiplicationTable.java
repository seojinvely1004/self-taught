package com.in28minutes.firstjavaproject;

public class MultiplicationTable {

	//5*1 = 5 
	//5 * 10 = 50
	void print() {
		for(int i = 1; i <=10; i ++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i ).println();
		}
	}
	void print(int table) {
		for(int i = 1; i<=10; i++) {
			System.out.printf("%d * %d = %d", table, i , table * i).println();
		}
	}
	void print(int table, int from,int to ) {
		for(int i = from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table, i , table * i).println();
		}
	}
}
