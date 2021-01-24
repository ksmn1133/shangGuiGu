package day_05;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array =new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*100);
            System.out.print(array[i]);
            if(i< array.length-1){
                System.out.print(",");
            }

        }
        System.out.println();
        //max value
        int maxValue = 10;
        Arrays.sort(array);
        maxValue=array[0];
        int minvalue = 100;
        minvalue=array[9];
        System.out.println("the max value is "+maxValue+"\n"+"the min value is "+minvalue);

    }
}
