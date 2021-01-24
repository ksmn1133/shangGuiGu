package day_13.finalTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaoxia
 * @create 2020/12/1 2:34 下午
 */
public class ThreadExtends extends Thread {
    private static int ticket = 100;

    /**
     * 线程安全问题有三种解决办法：1、synchronized 代码块 2、 synchronized方法 3、Lock接口的实现类ReentrantLock
     */

//    private static ReentrantLock reentrantLock = new ReentrantLock(true);
    @Override
    public void run() {
//        while(true){
//            reentrantLock.lock();
//            try{
//                if(ticket>0){
//                    System.out.println(Thread.currentThread().getName()+": "+ticket);
//                    ticket -=1;
//                }else{
//                    break;
//                }
//            }finally{
//                reentrantLock.unlock();
//            }

        while (true) {

            synchronized(ThreadExtends.class){

                if (ticket > 0) {
                    ThreadExtends.class.notify();
                    System.out.println(Thread.currentThread().getName() + ": " + ticket);
                    ticket -= 1;
                    try {
                        ThreadExtends.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                        break;
                }
            }

        }
//        while (true) {
//            show();
//            if(ticket<0){
//                break;
//            }
//        }
//    }
//    private static synchronized void show(){
//
//        if (ticket > 0) {
//            System.out.println(Thread.currentThread().getName() + ": " + ticket);
//            ticket -= 1;
//
//        }
    }

}

