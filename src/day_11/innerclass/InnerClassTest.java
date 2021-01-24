package day_11.innerclass;

/**
 * @author xiaoxia
 * @create 2020/11/26 9:36 上午
 */
public class InnerClassTest {
    private String name;
    private int age;

    /**
     * 成员内部类
     */
    class A{

    }

    public void method(){
        //局部内部类声明在方法中
        class B{

        }
    }

    //局部内部类声明在 代码块中
    {
        class C{

        }
    }

    //局部内部类声明在构造器中
    public InnerClassTest(){
        class D{

        }
    }

}
