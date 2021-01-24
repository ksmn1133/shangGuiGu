package day_13.T2;

/**
 * @author xiaoxia
 * @create 2020/11/30 6:27 下午
 */
public class TicktTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);
        Thread thread2 = new Thread(thread1);

        thread.start();
        thread2.start();

    }
}
