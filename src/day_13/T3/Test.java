package day_13.T3;

/**
 * @author xiaoxia
 * @create 2020/12/1 10:09 上午
 */
public class Test {
    public static void main(String[] args) {
        Window w1 = new Window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3  =new Thread(w1);

        t1.start();
        t2.start();
        t3.start();

    }
}
