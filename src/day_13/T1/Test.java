package day_13.T1;

/**
 * @author xiaoxia
 * @create 2020/11/29 1:44 下午
 */
public class Test {
    public static void main(String[] args) {
        ThreadC threadC = new ThreadC();
        Thread t1  = new Thread(threadC);
        t1.start();


    }
}
