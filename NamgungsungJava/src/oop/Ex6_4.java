package oop;

public class Ex6_4 {

	public static void main(String[] args) {//메서드 호출부 , main메서드에서 메서으 add를 호출한다. 
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L)= " + result4);

	}

}
class MyMath{//메서드 구현부 
	long add(long a, long b) {
		long result = a + b;
		return result;
		//위의 두 줄을 return a + b;로 한 줄로 표현할 수 있다 
	}
	long substract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {
		return a / b;
	}
}
