package array;

public class Ex5_7 {

	public static void main(String[] args) {
		//��Ŭ�������� Ŀ�ǵ���� �Ű������� �Է��Ͽ��� abc 123 "Hello world"
		System.out.println("�Ű������� ���� : " + args.length);//�Ű������� ���� : 3
		for(int i = 0; i <args.length; i++) {
			System.out.println("args[" + i + "] = \""+args[i] + "\"");//args[0] = "abc"args[1] = "123"args[2] = "Hello World"
			
		}
	}

}
