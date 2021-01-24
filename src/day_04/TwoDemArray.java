package day_04;

import java.util.Arrays;

public class TwoDemArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {2, 3}, {3, 4}};
        int[][] array1 = new int[2][3];
        array1 = new int[][]{{1, 2, 3}, {4, 5, 6}};

        int num = array1[0][1];
        System.out.println(num);

        //[[I@49e4cb85
        System.out.println(array);

        //[[I@2133c8f8
        System.out.println(array1);

        //遍历
        for (int i = 0; i < array1.length; i++) {
            for(int j =0;j< array1[i].length;j++){
                System.out.print(array1[i][j]);
                System.out.println(array1[i]);
            }
            System.out.println();
        }


    }
}
