package oop;

class Data {int x;}
class Ex6_6 {
/*기본형 매개변수 : 변수의 값을 읽기만 할 수 있다 
 * 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다
 * */
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);//main() : x = 10
		
		change(d.x);
		System.out.println("After change(d.x)");//After change(d.x)
		System.out.println("main() : x = " + d.x);//main() : x = 10

	}
	static void change(int x) {//기본형 매개변수 
		x = 1000;
		System.out.println("change() : x = " + x);//change() : x = 1000
	}

}
