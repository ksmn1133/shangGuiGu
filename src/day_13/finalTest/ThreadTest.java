package day_13.finalTest;



/**
 * @author xiaoxia
 * @create 2020/12/1 2:34 下午
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadExtends t1 = new ThreadExtends();
        ThreadExtends t2 = new ThreadExtends();
        t1.start();
        t2.start();
//        RunnableImpl runnable = new RunnableImpl();
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        Thread t3 = new Thread(runnable);
//        t1.start();
//        t2.start();
//        t3.start();
    }
}
