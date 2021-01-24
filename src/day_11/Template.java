package day_11;

import java.util.Date;

public abstract class Template {
    private String name ;
    private int age;
    public void test(){
        long start =  System.currentTimeMillis();

        method();

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }


    public abstract void method();




}
