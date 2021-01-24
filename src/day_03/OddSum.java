package day_03;

public class OddSum {
    public static void main(String[] args) {
        int result = 0;
        for (int num = 0; num <= 100; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                } else {
                    result += num;
                }
            }
        }
        System.out.println(result);

    }
}
