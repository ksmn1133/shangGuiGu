package day_13.T7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiaoxia
 * @create 2020/12/2 1:34 下午
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        /**
         * 如何创建一个线程池，在java.util.concurrent包中 有一个类 Executors
         * 是生产线程池的工具类
         */
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit(new CallableTest());
    }
}
