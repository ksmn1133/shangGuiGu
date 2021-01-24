package day_13.T7;

import java.util.concurrent.Callable;

/**
 * @author xiaoxia
 * @create 2020/12/2 1:37 下午
 */
public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("nihao");
        return null;
    }
}
