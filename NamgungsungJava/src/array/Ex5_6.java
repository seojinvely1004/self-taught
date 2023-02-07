package array;

public class Ex5_6 {

	public static void main(String[] args) {
		String[] names = new String[]{"Kim", "Park", "Yi"};
		
		for(int i = 0; i < names.length; i++)
			System.out.println("names["+ i + "]:" + names[i]);
		
		String tmp = names[2];//배열 names의 세 번째 요소를 tmp에 저장한다
		System.out.println("tmp:" + tmp);
		names[0] = "Yu";//배열 NAMES의 첫 번째 요소를 "Yu"로 변경한다
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);

	}

}
