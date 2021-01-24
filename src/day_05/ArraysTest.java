package day_05;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        //Arrays工具类 是用来操作数组的工具类 直接调用其中的方法
        int[] array = new int[]{1, 3, 2, 56, 436, 1, 7, 5, 24};
        int[] array2;

        //数组的复制
        array2 = Arrays.copyOf(array, array.length);
        //数组比较是否相等
        boolean isEqual = Arrays.equals(array, array2);
        System.out.println(isEqual);
        //按照规则打印数组
        System.out.println(Arrays.toString(array));
        //排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //二分法查找数组中的某个元素
        int i = Arrays.binarySearch(array, 56);
        System.out.println(i);
    }
}
