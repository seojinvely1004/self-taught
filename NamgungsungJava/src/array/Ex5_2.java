package array;

public class Ex5_2 {

	public static void main(String[] args) {
		//배열을 활용하여 총합과 평균 구하기 
		int sum = 0;//총합을 저장하기 위한 변수
		float average = 0f;//평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];//반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
		}
		average = sum / (float)score.length;//계산결과를 float타입으로 얻기 위해 형변환을 함 
		
		System.out.println("총합 : "+ sum);//총합 : 478
		System.out.println("평균 : "+ average);//평균 : 95.6
				

	}

}
