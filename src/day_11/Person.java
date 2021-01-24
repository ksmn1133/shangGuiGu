package day_11;
/**
*@author xiaoxia
*@create 2020/11/25 5:54 下午
*/
public interface Person {
    int num =10;
    void method();

    /**
     * 接口中可以定义静态方法，有方法体
     */
    static void method1(){
        System.out.println();
    }

    /**
     * 接口中可以定义默认方法，有方法体
     */
    default void method2(){
        System.out.println();
    }


}
