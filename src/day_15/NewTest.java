package day_15;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xiaoxia
 * @create 2020/12/9 4:27 下午
 */
public class NewTest {
    @Test
    public void testEnum(){
        Color black = Color.black;
        Thread t1 = new Thread(black);
        t1.start();

    }
}
