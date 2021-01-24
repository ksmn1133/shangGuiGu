package day_16;

import org.junit.Test;

import java.util.*;

/**
 * @author xiaoxia
 * @create 2020/12/11 9:41 下午
 */
public class IteratorTest {
    @Test
    public void testIterator(){
        Collection collection = new ArrayList<Integer>();
        collection.add(1);
        collection.add(2);

        Iterator iterator = collection.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    @Test
    public void testMethod(){
        Collection collection = new ArrayList();
        Collection collection1 =new ArrayList();
        //add addAll
        boolean add = collection.add(1);
        boolean add1 = collection.add(2);
        boolean add2 = collection.add(3);
        boolean addAll = collection.addAll(collection1);

        //remove removeAll clear
        collection.remove(1);
        collection.removeAll(collection1);
        collection1.clear();

        //size isEmpty
        int size = collection.size();
        System.out.println(size);

        boolean empty = collection.isEmpty();

        //contains containsAll
        boolean contains = collection.contains(1);
        boolean b = collection.containsAll(collection1);

        //collection --> array
        Object[] objects = collection.toArray();

        //array --> collection
        List<String> strings = Arrays.asList(new String[]{"", ""});

        //equals
        collection.equals(collection1);


    }

}
