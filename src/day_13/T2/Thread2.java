package day_13.T2;




/**
 * @author xiaoxia
 */
public class Thread2 extends Thread{
    private static int num;
    @Override
    public void run() {

        while(true){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            show();
            if(num<0){
                break;
            }
        }
    }

    public synchronized void show(){
        if(num>0){
            System.out.println(Thread.currentThread().getName()+": "+num);
            num--;
        }
    }

}
