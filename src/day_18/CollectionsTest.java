package day_18;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author xiaoxia
 * @create 2021/1/2 1:59 下午
 */
public class CollectionsTest {
    //Collections 是一个工具类，可以操作 List Set Map
    @Test
    public void method(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(13);
        integers.add(1123);
        integers.add(1242);

        Collections.sort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Collections.reverse(integers);


        Collections.shuffle(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Collections.max(integers);
        Collections.min(integers);

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 >o2){
                    return -1;
                }else{
                    return 1;
                }


            }
        });
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
    @Test
    public void testSafe(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(23);
        integers.add(45);
        integers.add(45);

        List<Integer> integers1 = Collections.synchronizedList(integers);
        for (Integer integer : integers1) {
              System.out.println(integer);
        }
    }
}
