package day_14;

import org.junit.jupiter.api.Test;

/**
 * @author xiaoxia
 * @create 2020/12/2 4:49 下午
 */
public class StringMethod {
    @Test
    public void show(){
        String str = new String("helloNihao");
        int length = str.length();
        System.out.println(length);

        char c = str.charAt(0);
        System.out.println(c);

        boolean isContain = str.contains("l");
        System.out.println(isContain);

        String s = str.toUpperCase();
        System.out.println(s);

        int hello = str.compareTo("hao");
        System.out.println(hello);

    }
}
