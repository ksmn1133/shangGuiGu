package day_13.T2;

/**
 * @author xiaoxia
 * @create 2020/11/30 6:34 下午
 */
public class Thread1 implements Runnable{
    private int number = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if(number>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number -=1;
                }else{
                    break;
                }
            }

        }

    }
}
