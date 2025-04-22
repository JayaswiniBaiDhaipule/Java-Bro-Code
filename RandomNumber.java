package PracticeProjects;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random1 = new Random();

        // for One dice

        // int number;
        // number = random1.nextInt(1,7);

        // System.out.println(number);

        // for three dice

        int number1;
        int number2;
        int number3;

        // number1 = random1.nextInt(1,7);
        // number2 = random1.nextInt(1,7);
        // number3 = random1.nextInt(1,7);

        number1 = random1.nextInt(1,101);
        number2 = random1.nextInt(1,101);
        number3 = random1.nextInt(1,101);

        System.out.print(number1+" ");
        System.out.print(number2+" ");
        System.out.println(number3);

        double num;
        // Number from 0 and 1
        num = random1.nextDouble();

        System.out.println(num);

        boolean isHeads;

        isHeads = random1.nextBoolean();

        if(isHeads){
            System.out.println("HEAD");
        }else{
            System.out.println("TAIL");
        }

        
        
        
    }
    
}
