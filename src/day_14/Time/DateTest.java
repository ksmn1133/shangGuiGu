package day_14.Time;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author xiaoxia
 * @create 2020/12/4 1:01 下午
 */
public class DateTest {
    @Test
    public void method(){
        Long time = System.currentTimeMillis();
        System.out.println(time);
        Date date = new Date();
        System.out.println(date);

        long time1 = date.getTime();
        System.out.println(time1);
        System.out.println("==================");

        date.setTime(1507062172039L);
        System.out.println(date);

    }
}
