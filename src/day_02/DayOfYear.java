package day_02;

import java.util.Date;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input month");
        int month = scanner.nextInt();
        System.out.println("please input day ");
        int day = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println(day);
            case 2:
                System.out.println(31+day);
            case 3:
                System.out.println(31+28+day);
            case 4:
                System.out.println(31+28+31+day);
            case 5:
            case 6:
            default:
        }
    }
}
