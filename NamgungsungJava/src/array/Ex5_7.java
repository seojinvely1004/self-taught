package array;

public class Ex5_7 {

	public static void main(String[] args) {
		//이클립스에서 커맨드라인 매개변수를 입력하였다 abc 123 "Hello world"
		System.out.println("매개변수의 개수 : " + args.length);//매개변수의 개수 : 3
		for(int i = 0; i <args.length; i++) {
			System.out.println("args[" + i + "] = \""+args[i] + "\"");//args[0] = "abc"args[1] = "123"args[2] = "Hello World"
			
		}
	}

}
