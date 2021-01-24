package day_05;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 41, 52, 2, 5, 6, 6353, 235, 4};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
