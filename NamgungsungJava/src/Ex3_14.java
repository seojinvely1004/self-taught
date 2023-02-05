
public class Ex3_14 {

	public static void main(String[] args) {
		//두 문자열을 비교할 때는, 비교ㅕ 연산자 '=='대신 equals()메서드를 사용해야 한다. 
		//비교연산자는 두 문자열이 완전히 같은 것인지 비교할 뿐이므로, 문자열의 내용이 같은지 비교하기 위해서는 equals()를 사용하는 것이다. 
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");//str2=="abc" ? false
		System.out.printf("str2.equals(\"abc\")? %b%n", str2.contentEquals("abc"));//str2.equals("abc")? true
		
		//str2와 "abc"의 내용이 같은데도 '=='로 비교하면 false를 결과로 얻는다. 내용은 같지만 서로 다른객체이기 때문이다.

		//대소문자를 구분하고싶지 않으면 equals()대신 equalsIgnoreCase()를 쓰면 된다.

	}

}
