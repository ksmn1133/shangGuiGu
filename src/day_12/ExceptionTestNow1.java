package day_12;

import org.junit.jupiter.api.Test;

/**
 * @author xiaoxia
 * @create 2020/11/27 1:34 下午
 */
public class ExceptionTestNow1 {
    @Test
    public void testThrows() throws ArrayIndexOutOfBoundsException{
        int[] array = new int[]{1,2,3};
        System.out.println(array[1]);
    }


}
