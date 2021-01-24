package day_13.T4;

/**
 * @author xiaoxia
 * @create 2020/12/1 1:12 下午
 */
public class LockTest {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        Thread t1 = new Thread(myLock);
        Thread t2 = new Thread(myLock);

        t1.start();
        t2.start();
    }

}
