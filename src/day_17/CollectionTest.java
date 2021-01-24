package day_17;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author xiaoxia
 * @create 2020/12/23 10:14 下午
 */
public class CollectionTest {
    @Test
    public void testCollection(){
        Collection collection = new ArrayList();
        collection.add(1);
        collection.addAll(new ArrayList());
        collection.remove(1);
        collection.removeAll(new ArrayList<>());
        collection.size();
        collection.clear();
        collection.isEmpty();
        collection.contains(1);
        collection.containsAll(new ArrayList<>());
        collection.toArray();
    }
}
