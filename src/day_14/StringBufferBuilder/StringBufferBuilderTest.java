package day_14.StringBufferBuilder;

import org.junit.jupiter.api.Test;

/**
 * @author xiaoxia
 * @create 2020/12/4 9:50 上午
 */
public class StringBufferBuilderTest {
//    private final int num;
//
//    public StringBufferBuilderTest(int num) {
//        this.num = num;
//    }

    @Test
    public void test() {

        /**
         *   String:底层是被final修饰的byte数组
         *   private final byte[] value;
         *   StringBuffer extends AbstractStringBuilder
         *
         */

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        int capacity = stringBuffer.capacity();
        System.out.println(capacity);
    }
    @Test
    public void test1(){
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer("nihao");
        StringBuffer stringBuffer2 =  new StringBuffer(32);

        StringBuilder stringBuilder = new StringBuilder("hello");


        stringBuffer1.append(1);
        stringBuffer1.delete(0,0);
        System.out.println(stringBuffer1);
        stringBuffer1.replace(0,1,"xx");
        System.out.println(stringBuffer1);
        stringBuffer1.reverse();
        System.out.println(stringBuffer1);

    }
    @Test
    public void test2(){
        StringBuilder stringBuilder = new StringBuilder("abcdef");
        stringBuilder.append(123);
        stringBuilder.delete(6,9);
        System.out.println(stringBuilder);
        stringBuilder.replace(0,3,String.valueOf(123));
        System.out.println(stringBuilder);
        stringBuilder.insert(3,4);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

}
