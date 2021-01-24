package day_05;

import java.util.Arrays;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};

        int[] array2 = Arrays.copyOf(array1, 8);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+",");
        }
        System.out.println();
        System.out.println(array1);
        System.out.println(array2);
    }
}
