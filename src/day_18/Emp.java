package day_18;

import java.util.List;

/**
 * @author xiaoxia
 * @create 2021/1/12 3:42 下午
 */
public class Emp <E>{

    public void method(E e){
        System.out.println(e);
        new Teacher<Integer>();
    }

    public <T> void add(List<T> list){

    }

}
