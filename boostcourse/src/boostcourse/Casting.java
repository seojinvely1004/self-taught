package boostcourse;

public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		//System.out.println(b); //1.0
		
		//int c = 1.1; //double���� �������ε� int�� �������� �ϹǷ� > ����ȯ�� ������.
		
		double d = 1.1;
		int e = (int) 1.1; //double�� 1.1�� ������ integar������ �ٲ����� 
		System.out.print(e); //1_ �ս��� ���� ������ �ڵ����� Casting�� ���ش�.
		
		//1 to String (java int to String casting �˻��ϸ鳪�´�.����ȭ)
		//String strI = Integer.toString(i);��� ���´�.
		
		String f = Integer.toString(1);
		//System.out.println(f); //1
		System.out.println(f.getClass());//f�� �����ִ� ������ Ÿ���� �˷��� /1class java.lang.String

	}

}
