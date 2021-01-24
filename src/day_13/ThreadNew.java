package day_13;

import java.util.concurrent.FutureTask;

/**
 * @author xiaoxia
 * @create 2020/12/2 10:09 上午
 */
public class ThreadNew {
    public static void main(String[] args) {
        CallTest callTest = new CallTest();
        FutureTask futureTask = new FutureTask(callTest);
        Thread t1 = new Thread(futureTask);
        t1.start();

    }
}
/**
 *     interface :Runnable
 *     interface :Callable<V>
 *     interface :Future<V>
 *     Class :FutureTask<V> implements Future,Runnable
 *     Class :Thread implements Runnable
 *     1.Class implements Callable,Override method :call()
 *          public V call() throws Exception;
 *     2.new Class
 *     3.FutureTask futureTask  = new FutureTask( Callable callable);
 *                              = new FutureTask(Runnable runnable,V result);
 *     4.Thread t1 = new Thread(futureTask);
 *     5..Object obj = futureTask.get();    method call()'s return value
 *
 */
