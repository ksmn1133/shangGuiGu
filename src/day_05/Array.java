package day_05;

public class Array {
    public static void main(String[] args) {
        int[][] array = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(",");
                }
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
