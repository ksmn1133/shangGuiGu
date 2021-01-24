package day_13.T6;

/**
 * @author xiaoxia
 * @create 2020/12/1 8:04 下午
 */
public class Producer implements Runnable{
    @Override
    public void run() {
        synchronized (Clerk.producer){
            System.out.println(Thread.currentThread().getName()+": "+"begin produce");
        }
    }
}
