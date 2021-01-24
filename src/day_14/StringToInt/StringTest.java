package day_14.StringToInt;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author xiaoxia
 * @create 2020/12/2 5:54 下午
 */
public class StringTest {

    @Test
    public void show() {
        String str = "123";
        Integer integer = 123;
        //包装类转换成字符串
        String s = String.valueOf(integer);
        System.out.println(s);
        //字符串转换成包装类
        int i = Integer.parseInt(str);
        System.out.println(i);
        //字符串转换成字符数组
        char[] array = str.toCharArray();

        String s1 = array.toString();

        //字符串转换成字节数组
        byte[] bytes = str.getBytes();

    }

    @Test
    public void show1() {
        String str = "abc123";

        char[] array = str.toCharArray();
        char[] arrayNew = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i != array.length - 1) {
                arrayNew[i] = array[array.length - i - 1];
            } else {
                arrayNew[i] = array[i];
            }
        }

        System.out.println("===================");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i]);
        }

    }

    @Test
    public void show2() {
        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuffer stringBuffer1 = new StringBuffer("abc");
        System.out.println(stringBuffer == stringBuffer1);
        boolean same = stringBuffer.toString().equals(stringBuffer1.toString());
        System.out.println(same);
    }


}
