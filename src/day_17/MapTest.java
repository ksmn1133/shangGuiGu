package day_17;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoxia
 * @create 2020/12/24 2:28 下午
 * Map interface
 *     HashMap
 *          LinkedHashMap
 *     TreeMap
 *     Hashtable
 *          properties
 *
 *
 *     HashMap底层源码
 *     jdk7：数组+链表
 *     new HashMap（）
 *          创建了一个长度为16的Entry[] obj 数组
 *     .put(K，V)；
 *          首先根据K的hashcode &15 计算出该键值对所要存储的位置，
 *          如果该位置上没有其他元素则添加成功
 *          如果该位置上有其他元素，则比较他们的hashcode是否相同，
 *              如果不相同则添加成功
 *              如果有一个相同，则调用K所在类的equals方法
 *                  如果返回false则添加成功
 *                  如果返回true，则将V替换原来的值
 *
 *    在不断的添加数据过程中，会涉及到扩容的问题，默认扩容到原来的2倍
 *
 *
 *
 */
public class MapTest {
    @Test
    public void testMap(){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(null,null);
        objectObjectHashMap.put(new Object(),new Object());
        HashMap hashMap = new HashMap();

    }
}
