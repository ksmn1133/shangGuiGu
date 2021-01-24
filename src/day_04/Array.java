package day_04;

public class Array {
    public static void main(String[] args) {
        //如何创建一个int类型的数组

        int[] array = new int[]{1, 2};
        System.out.println(array.length);
        int[] array1 = {1, 2, 3, 4};
        System.out.println(array1.length);

        char[] array2 = {'a', 'b', 'c'};
        System.out.println(array2);

        //数组的遍历
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //byte型数组（底层) 和 char型数组 --> String
        System.out.println("===============================");
        String str = "abc";

        byte[] bytes = str.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        char[] str2 = str.toCharArray();

        System.out.println(str2);
    }
}
