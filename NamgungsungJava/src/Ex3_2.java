
public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ",j="+j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + "j,j="+j );
		
		i = 5;
		j = 5;
		System.out.println(i++);//i값을 출력 후 1 증가
		System.out.println(++j);//j값을 1 증가 후 출력
		System.out.println("i = " + i + ",j=" + j);

	}

}
