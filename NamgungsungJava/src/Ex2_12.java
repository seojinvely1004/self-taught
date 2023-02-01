
public class Ex2_12 {

	public static void main(String[] args) {
		String str="3";
		
		System.out.println(str.charAt(0) - '0');//3문자열을 문자로 변환 charAt()
		System.out.println('3' - '0' + 1);//4
		System.out.println(Integer.parseInt("3") + 1);//4문자열을 숫자로 변환 Integer.parseInt또는Double.parseDouble
		System.out.println("3" + 1);//31
		System.out.println((char)(3+'0'));//숫자를 문자로 반환 - 숫자에 '0'을 더한다
	}

}
