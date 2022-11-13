package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

         //Judgement judgement = new Judgement();
         //final boolean place = judgement.hasPlace(Arrays.List(7, 8, 9), placeIndex:0, number:7); //헷갈린다면 placeNumber+1로해도된다.
         //System.out.println(place);//true
         //final boolean place = judgement.hasPlace(Arrays.List(7, 8, 9), placeIndex:1, number:7); 
         //System.out.println(place);//false
         //final boolean place = judgement.hasPlace(Arrays.List(7, 8, 9), placeIndex:1, number:8); 
         //System.out.println(place);//true

         //final Refree referee = new Referee();
         //final String result = referee.compare(Array.asList(1, 2, 3), Array.asList(1, 2, 3));//referee야 컴퓨터의 숫자와 나의 숫자가 같은지 compare()해줘~ 
         //System.out.println(result);//0볼 3 스트라이크

         //final String result = referee.compare(Array.asList(3, 1, 2), Array.asList(1, 2, 3));
         //System.out.println(result);//3볼 0 스트라이크 

         final NumberGenerator generator = new NumberGenerator();//1. referee에게 주는 숫자는 numberGenerator가 만든 숫자이다.
         final List<Integer> computer = generator.createRandomNumbers();//generator에게 가져온 숫자로 computer가 RandomNumbers 

         final Refree referee = new Referee();

        //4. result가 0볼 0스트라이크가 되어야 게임이 끝이 난다.
         String result = "";
         while (!result.equals("0볼 3스트라이크")) {//0볼 3스트라이크가 아닌동안 반복한다
            result = fereree.compare(computer, askNumbers());
            System.out.println(result);
         }
         System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");     
    }

    public static List<Integer> askNumbers() {//3.사용자에게 입력을 받기 위해 출력창을 만들어준다
        System.out.print("숫자를 입력해 주세요 : ");
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.next();
        
        List<Integer> numbers = new ArrayList<>(); 
        for (String number : input.split(regex:"")) {
            numbers.add(Inteter.valueOf(number));
            
        return numbers;
    }
}
