package boostcourse;

public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		//System.out.println(b); //1.0
		
		//int c = 1.1; //double형의 데이터인데 int에 담으려고 하므로 > 형변환을 해주자.
		
		double d = 1.1;
		int e = (int) 1.1; //double인 1.1을 강제로 integar형으로 바꿔주자 
		System.out.print(e); //1_ 손실이 없기 때문에 자동으로 Casting을 해준다.
		
		//1 to String (java int to String casting 검색하면나온다.습관화)
		//String strI = Integer.toString(i);라고 나온다.
		
		String f = Integer.toString(1);
		//System.out.println(f); //1
		System.out.println(f.getClass());//f가 갖고있는 데이터 타입을 알려줘 /1class java.lang.String

	}

}
