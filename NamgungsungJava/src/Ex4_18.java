import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("(1) �ѽ�");
		System.out.println("(2) ���");
		System.out.println("(3) �߽�");
		System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>>");
		
		String tmp = scanner.nextLine();// �Է¹��� ������ tmp�� ����
		menu = Integer.parseInt(tmp);//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		if(menu == 0) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}else if(!(1 <= menu && menu <=3)) {
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
			continue;
		}
		System.out.println("�����Ͻ� �޴���" + menu + "���Դϴ�.");
		
		}
	}

}
