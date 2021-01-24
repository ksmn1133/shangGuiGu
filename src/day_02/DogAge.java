package day_02;

import java.util.Scanner;

public class DogAge {
    public static void main(String[] args) {
        double age_dog;
        System.out.println("please input dog age :");
        Scanner scanner = new Scanner(System.in);
        double age_human = scanner.nextDouble();
        if (age_human <= 2) {
            age_dog = age_human * 10.5;

        } else {
            age_dog = 21 + (age_human - 2) * 4;

        }
        System.out.println("the dog age is "+age_dog);

    }
}
