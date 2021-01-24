package day_13.T4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaoxia
 * @create 2020/12/1 1:19 下午
 */
public class MyLock implements Runnable {
    private int num = 100;
    private ReentrantLock reentrantLock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            reentrantLock.lock();
            try {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + num);
                    num--;
                } else {
                    break;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}