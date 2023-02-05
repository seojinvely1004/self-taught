
public class Ex4_13 {

	public static void main(String[] args) {//1부터 몇까지 더해야 100을 넘지 않는지 알아내는 예제 
		int sum = 0;
		int i = 0;
		//i를 1씩 증가시켜 sum에 계속 더해 나간다.
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}

	}

}
