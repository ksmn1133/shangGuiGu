package day_02;

import java.util.Random;
import java.util.Scanner;

public class Lo {
    public static void main(String[] args) {
        Random lo = new Random();
        int luckyNum = lo.nextInt(100);
        System.out.println(luckyNum);
        int firstNum = luckyNum / 10;
        int secondNum = luckyNum % 10;

        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        if (luckyNum == myNum) {
            System.out.println("$10000");
            return;
        }
        if( (myNum+"").contains(firstNum+"")&&(myNum+"").contains(secondNum+"") ){
            System.out.println("$500");
        }else{
            System.out.println("thanks");
        }
    }
}
