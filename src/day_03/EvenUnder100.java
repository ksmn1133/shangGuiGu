package day_03;

public class EvenUnder100 {
    public static void main(String[] args) {

        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
