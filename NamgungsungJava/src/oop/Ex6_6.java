package oop;

class Data {int x;}
class Ex6_6 {
/*�⺻�� �Ű����� : ������ ���� �б⸸ �� �� �ִ� 
 * ������ �Ű����� : ������ ���� �а� ������ �� �ִ�
 * */
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);//main() : x = 10
		
		change(d.x);
		System.out.println("After change(d.x)");//After change(d.x)
		System.out.println("main() : x = " + d.x);//main() : x = 10

	}
	static void change(int x) {//�⺻�� �Ű����� 
		x = 1000;
		System.out.println("change() : x = " + x);//change() : x = 1000
	}

}
