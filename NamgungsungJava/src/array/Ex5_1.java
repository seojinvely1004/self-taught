package array;

import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i<iArr1.length; i++) {//배열을 for문으로 초기화한다. 
			iArr1[i] = i + 1;
		}
		for(int i = 0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		for(int i = 0; i <iArr1.length;i++) {
			System.out.printf(iArr1[i]+",");
		}
		System.out.println();//1,2,3,4,5,6,7,8,9,10,
		//Arrays.toString(배열이름) : 배열의 모든 요소를 [첫번째요소, 두번째요소..]와 같은 형식의 문자열로 만들어서 반환한다.
		System.out.println(Arrays.toString(iArr2));//[3, 10, 2, 7, 8, 1, 8, 5, 5, 7]랜덤
		System.out.println(Arrays.toString(iArr3));//[100, 95, 80, 70, 60]
		System.out.println(Arrays.toString(chArr));//[a, b, c, d]
		System.out.println(iArr3);//[I@7d4991ad실행할 때마다 달라질 수 있다.
		System.out.println(chArr);//abcd

	}

}
