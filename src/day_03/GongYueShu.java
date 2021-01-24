package day_03;

import java.util.Scanner;

public class GongYueShu {
    public static void main(String[] args) {
        //获取两个正整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number");
        int num1 = scanner.nextInt();
        System.out.println("please input another number");
        int num2 = scanner.nextInt();
        if (num1 < 0 || num2 < 0) {
            System.out.println("wrong！");
        } else {
            //判断公约数和公倍数
            for (int i = Math.max(num1, num2); i >= 1; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
            System.out.println("good");

        }
    }
}
