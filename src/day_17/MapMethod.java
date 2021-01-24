package day_17;

import org.junit.Test;

import java.util.*;

/**
 * @author xiaoxia
 * @create 2020/12/28 3:36 下午
 */
public class MapMethod {
    @Test
    public void testMethod(){
        HashMap hashMap = new HashMap();
        Student st1 = new Student("lisi",20);
        Student st2  =new Student("zhangsan",18);
        Object put = hashMap.put(st1,16);
        hashMap.put(st2,27);
        System.out.println(hashMap);
        hashMap.remove(st1);
        System.out.println(hashMap);

        Object zhangsan = hashMap.get(st2);
        System.out.println(zhangsan);

        Set set = hashMap.keySet();
        for(Object obj :set){
            System.out.println(obj);
        }
        System.out.println("============");
        Collection values = hashMap.values();
        Iterator iterator=values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============");
        Set set1 = hashMap.entrySet();
        for (Object o : set1) {
            System.out.println(o);

            Map.Entry o1 = (Map.Entry) o;

        }

        hashMap.clear();

        boolean empty = hashMap.isEmpty();
        System.out.println(empty);


    }

    @Test
    public void method(){
        Properties properties = new Properties();
    }
}
