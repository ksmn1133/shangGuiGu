package day_16;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author xiaoxia
 * @create 2020/12/15 10:45 下午
 */
public class ListTest {
    @Test
    public void testArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"a");
        arrayList.add(1,"def");
        arrayList.add(1,"z");
        arrayList.remove(0);
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers.add(123);
        integers.add(123);
        integers.add(123);
        integers.addAll(integers1);
        boolean remove = integers.remove(new Integer(12));
        System.out.println(remove);

        integers.set(1,0);
        

    }
    @Test
    public void testList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addAll(Arrays.asList(3,4,5));
        System.out.println(linkedList.indexOf(4));
        List<Integer> integers = linkedList.subList(0, 3);
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
        linkedList.remove(new Integer(1));


    }
}