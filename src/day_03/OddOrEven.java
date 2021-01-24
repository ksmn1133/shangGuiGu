package day_03;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odd =0;
        int even =0;
        while (true) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even++;

            } else {
                odd++;
            }
            System.out.println("even:"+even+" odd:"+odd);
            if (num == 0 ){
                break;
            }
        }

    }
}
