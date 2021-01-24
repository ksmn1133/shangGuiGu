package day_12;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally{
            System.out.println("done!");
        }
    }
}
