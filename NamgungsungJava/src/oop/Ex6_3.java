package oop;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width); //Card.width = 100
		System.out.println("Card.height = " + Card.height);//Card.height = 250
		//Ŭ��������(static����)�� ��ü���� ���� 'Ŭ�����̸�.Ŭ���� ����'�� ���� ��� �����ϴ�.
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		//�ν��Ͻ� ������ ���� �����Ѵ�
		
		System.out.println("c1�� "+ c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + "," + c1.height + ")" );//c1�� Heart, 7�̸�, ũ��� (100,250)
		System.out.println("c2�� "+ c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + "," + c2.height + ")" );//c2�� Spade, 4�̸�, ũ��� (100,250)
		System.out.println("==========================================");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width=50;
		c1.height=80;
		//Ŭ���������� ���� �����Ѵ�. 
		System.out.println("c1�� "+ c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + "," + c1.height + ")" );//c1�� Heart, 7�̸�, ũ��� (50,80)
		System.out.println("c2�� "+ c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + "," + c2.height + ")" );//c2�� Spade, 4�̸�, ũ��� (50,80)

		
		
	}

}
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
