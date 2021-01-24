package day_13.T5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaoxia
 * @create 2020/12/1 1:48 下午
 */
public class BankAccount implements Runnable{
    private static int money = 1000;
    private ReentrantLock  reentrantLock = new ReentrantLock();
    public static int getMoney() {
        return money;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reentrantLock.lock();
            try{
                BankAccount.money = getMoney() +1000;
                System.out.println(Thread.currentThread().getName()+": "+BankAccount.money);
            }finally{
                reentrantLock.unlock();
            }

        }
    }

}
