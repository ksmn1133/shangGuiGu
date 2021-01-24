package day_14.Time;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaoxia
 * @create 2020/12/5 11:17 上午
 */
public class DateTest1 {
    @Test
    public void method() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        long time = date.getTime();
        System.out.println(date);
        /**
         *  SimpleDateFormat 的功能
         *  1、格式化： 将Date类-->String
         *  2、解析：   将String类-->Date
         *
         */
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        /*
          带参数的构造器，String pattern
          y M d h m s
         */
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String str1 = sdf1.format(date);
        System.out.println(str1);

        try {

            Date date1 = sdf1.parse(str1);
            System.out.println(date1);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test1() {
        /**
         * String
         *java.util.Date
         *java.sql.Date
         *
         */
        String str = "2020-01-01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date  date = simpleDateFormat.parse(str);
            java.sql.Date date1 = new java.sql.Date(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
