
public class Ex3_14 {

	public static void main(String[] args) {
		//�� ���ڿ��� ���� ����, �񱳤� ������ '=='��� equals()�޼��带 ����ؾ� �Ѵ�. 
		//�񱳿����ڴ� �� ���ڿ��� ������ ���� ������ ���� ���̹Ƿ�, ���ڿ��� ������ ������ ���ϱ� ���ؼ��� equals()�� ����ϴ� ���̴�. 
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");//str2=="abc" ? false
		System.out.printf("str2.equals(\"abc\")? %b%n", str2.contentEquals("abc"));//str2.equals("abc")? true
		
		//str2�� "abc"�� ������ �������� '=='�� ���ϸ� false�� ����� ��´�. ������ ������ ���� �ٸ���ü�̱� �����̴�.

		//��ҹ��ڸ� �����ϰ���� ������ equals()��� equalsIgnoreCase()�� ���� �ȴ�.

	}

}
