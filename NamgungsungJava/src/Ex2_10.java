import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//ScannerŬ������ ��ü�� ����
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();//�Է¹��� ������ input�� ����
		int num = Integer.parseInt(input);//�Է¹��� ���ڿ��� ����(int Ÿ��)�� ��ȯ
		System.out.println("�Է³��� : "+input);
		System.out.printf("num=%d%n",num);
		
		

	}

}
