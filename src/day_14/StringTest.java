package day_14;

import org.junit.jupiter.api.Test;

/**
 * @author xiaoxia
 * @create 2020/12/2 2:26 下午
 */
public class StringTest {
    @Test
    public void run(){
        String str1 = new String("asb");
        System.out.println(str1);
        byte[] str2 =new  byte[]{1,23,4};
        String s1 = "a";
        String s2 = "a";

        System.out.println(s1.equals(s2));
        String s3 = new String("b");
        String s4  = new String("b");
        System.out.println("====================");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        s4="nihao";
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("=====================");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}
