import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		System.out.println("���� ���� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();//ȭ���� ���� �Է¹��� ���ڸ� month�� ����
		
		switch(month) {//switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾���Ѵ�.
		case 3:
			case 4:
				case 5://case���� ����, ���,���ڿ��� �����ϸ� �ߺ����� �ʾƾ� �Ѵ� 
					System.out.println("������ ������ ���Դϴ�.");
					break;
				case 6: case 7: case 8:
					System.out.println("������ ������ �����Դϴ�.");
					break;
				case 9: case 10: case 11:
					System.out.println("������ ������ �����Դϴ�.");
					break;
					default:
						System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	}

}
