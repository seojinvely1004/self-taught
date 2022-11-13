package baseball;

import java.util.Arrays;

import baseball.domain.NumberGenerator;
/*객체 지향 프로그래밍 
*1. 기능을 가지고 있는 클래스를 인스턴스화(= 객체, object) 한다. 
*2. 필요한 기능을 각 인스턴스가 역할에 맞게 수행하게 한다.(의인화) 즉, 기능별로 나눈다. 
*3. 그 결과를 종합한다( 종합하여 하나의 프로그램을 동작시키게 한다. )
 */

public class Application {
    public static void main(String[] args) {
        //NumberGenerator generator = new NumberGenerator();
        //List<Integer> numbers = generator.createRandomNumbers();
        //System.out.println(numbers);
        
         //Judgement judgement = new Judgement();
         //final int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3);
         //System.out.println(count);  //3       
         
         //judgement.correctCount(Arrays.asList(2, 8, 9), Arrays.asList(1, 2, 3);
         //System.out.println(count);  //1
         //judgement.correctCount(Arrays.asList(7, 8, 9), Arrays.asList(1, 2, 3);
         //System.out.println(count);  //0

         Judgement judgement = new Judgement();
         final boolean place = judgement.hasPlace(Arrays.List(7, 8, 9), placeIndex:0, number:7); //헷갈린다면 placeNumber+1로해도된다.
         System.out.println(place);//true
         //final boolean place = judgement.hasPlace(Arrays.List(7, 8, 9), placeIndex:1, number:7); 
         //System.out.println(place);//false
         //final boolean place = judgement.hasPlace(Arrays.List(7, 8, 9), placeIndex:1, number:8); 
         //System.out.println(place);//true
    }
}
