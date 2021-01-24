package day_11;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton method = Singleton.method();
        Singleton method1 = Singleton.method();
        System.out.println(method == method1);

        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);
    }
}
