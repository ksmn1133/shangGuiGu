package day_11.duixiangbijiao;

import day_11.Person;

/**
 * @author xiaoxia
 * @create 2020/11/25 5:56 下午
 */
public class PersonImpl implements Person{
    /**
     * 实现接口中的抽象方法
     */
    @Override
    public void method() {

    }

    /**
     * 对于实现类来说，接口中的静态方法是看不到的，只能通过
     * 接口名.静态方法名来调用
     */
    public  void show(){
        Person.method1();
    }

    /**
     * 重写接口中的默认方法
     */
    @Override
    public void method2() {

    }

    public void test(){
        /*
        创建实现类对象去调用接口中的默认方法
         */
        new PersonImpl().method2();
    }
}
