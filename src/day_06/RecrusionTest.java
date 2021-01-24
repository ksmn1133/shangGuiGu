package day_06;

public class RecrusionTest {
    public static void main(String[] args) {
        System.out.println(re(8));
    }

    public static int re(int n) {
        int[] array = new int[n + 3];
        array[0]=1;
        array[1]=4;

        array[n+2]=2*re(n+1)+re(n);
        return array[n+2];


    }
}
