package day_12;

import java.io.IOException;

/**
 * @author xiaoxia
 * @create 2020/11/27 1:53 下午
 */
public class Teacher extends Person{
    @Override
    public void method() throws IOException {
        System.out.println("sub class's method!");
    }
}
