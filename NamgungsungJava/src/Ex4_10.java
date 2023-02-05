
public class Ex4_10 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <=5; i++) {
			sum +=i;
			System.out.printf("1부더 %02d까지의 합 : %2d%n", i, sum);
			//%2d 2자리보다 작으면 여백을 추가하여 2자리를 확보한다. 예  1,  2자리보다 크면 그대로 출력된다 . 예 12345
			//%02d 2자리보다 작으면 02를 추가해서 2자릴르확보한다. 예01, 2자리보다 크면 그대로 출력된다. 예12345
		
		}

	}

}
