package day_11;

//singleton 饿汉
public class Singleton {
    //私有化构造方法，不能让其他类创建对象
    private Singleton() {

    }

    //    通过静态方法调用 创建对象
    static Singleton obj = new Singleton();

    public static Singleton method() {

        return obj;
    }
}
