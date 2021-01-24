package day_18;

import org.junit.Test;

import java.util.*;

/**
 * @author xiaoxia
 * @create 2021/1/8 11:31 下午
 */
public class E {
    @Test
    public void test() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(15);
        integers.add(10);
        integers.add(20);

        for (Integer integer : integers) {
            int num = integer;
            System.out.println(num);
        }

        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            int nums = iterator.next();
            System.out.println(nums);
        }

    }
    @Test
    public void method(){
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("jane",11);
        stringIntegerHashMap.put("Tom",21);
        stringIntegerHashMap.put("jack",14);

        Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

        }

    }
}
