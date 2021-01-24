package day_13;

import java.util.concurrent.Callable;

/**
 * @author xiaoxia
 * @create 2020/12/2 10:09 上午
 */
public class CallTest implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("nihao");
        return null;
    }
}
