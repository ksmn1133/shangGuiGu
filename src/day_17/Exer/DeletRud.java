package day_17.Exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author xiaoxia
 * @create 2020/12/24 1:45 下午
 */
public class DeletRud {
    @Test
    public void testDelete() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(22);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        HashSet hashSet = new HashSet(arrayList);
        for (Object o : hashSet) {
            System.out.println(o);
        }



    }
}
