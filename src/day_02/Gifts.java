package day_02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str ="男";

//        char[] arr = str.toCharArray();
//        System.out.println(arr[0]);

        System.out.println(str.charAt(0));

        while(true){
            System.out.println("please input your grade:");
            double grade = scanner.nextDouble();
            if (grade > 100 || grade <= 0) {
                System.out.println("please try again");

            } else if (grade <= 100 && grade >= 90) {
                System.out.println("bmw");
            } else {
                System.out.println("iphone");
            }
        }




    }
}
