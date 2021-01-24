package day_15;

import java.util.concurrent.Callable;

/**
 * @author xiaoxia
 * @create 2020/12/9 10:25 上午
 * @version 1.0
 * @since 1.0
 */
public enum Season implements Runnable, Callable {
    /*
    * 提供当前枚举类的对象，对象之间用逗号隔开，最后一个用分号结尾
    *
    */

    SPRING,

    SUMMER{
        @Override
        public void run() {
            super.run();
        }
    },
    FALL{

    },
    WINTER;

    private String name;
    private String age;

    private Season(){

    }

    private Season(String name,String age){
        this.age = age;
        this.name = name;
    }

    @Override
    public void run() {

    }


    @Override
    public Object call() throws Exception {
        return null;
    }
}
