package day_13.T5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaoxia
 * @create 2020/12/1 2:52 下午
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    private ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {

            if (ticket>0) {
                System.out.println(Thread.currentThread().getName()+": "+ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
