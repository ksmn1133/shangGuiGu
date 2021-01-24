package day_13.T3;

/**
 * @author xiaoxia
 * @create 2020/12/1 10:09 上午
 */
public class Window implements Runnable {
    private static int num = 100;

    @Override
    public  void run() {
        while (true) {
            show();
            if(num<=0){
                break;
            }
        }
    }

    public synchronized void show(){
        if (num > 0) {
            System.out.println(Thread.currentThread().getName()+": "+num);
            num--;
        }
    }

}
