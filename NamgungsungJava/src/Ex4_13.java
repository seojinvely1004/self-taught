
public class Ex4_13 {

	public static void main(String[] args) {//1���� ����� ���ؾ� 100�� ���� �ʴ��� �˾Ƴ��� ���� 
		int sum = 0;
		int i = 0;
		//i�� 1�� �������� sum�� ��� ���� ������.
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}

	}

}
