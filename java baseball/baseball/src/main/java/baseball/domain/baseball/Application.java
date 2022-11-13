package baseball;

import baseball.domain.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator teacher = new Calculator(); //teacher라는 인스턴스
        
        System.out.println(teacher.add(1,3));  //4
        //System.out.println(teacher.shareResult); //4
        System.out.println(Calculator.shareResult);

        Calculator calculator = new Calculator(); //calculator라는 인스턴스
        
        System.out.println(calculator.add(2000,21); //2021  
        //System.out.println(calculator.shareResult); //2021
        System.out.println(Calculator.shareResult);//2021

        System.out.println(teacher.result);//4 //이미 인스턴스화 할 때 복사가 되었기 때문에 
        //System.out.println(teacher.shareResult);//2021
        System.out.println(Calculator.shareResult);//2021

        System.out.println(Calculator.SHARE_BIRTHDAY);
    }
    
}
