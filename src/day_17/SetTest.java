package day_17;

import org.junit.Test;

import java.util.*;

/**
 * @author xiaoxia
 * @create 2020/12/22 2:15 下午
 */
public class SetTest {
    /**
     * Collection(interface)
     * Set(interface) 无序 不重复
     * HashSet Set 接口的主要实现类 线程不安全的 可以存储null值
     * LinkedHashSet
     * TreeSet
     * <p>
     * 1、无序性：无序性并不等于随机性。HashSet 存储对象时和遍历时的顺序并不相同，存储对象时是按照对象的哈希值顺序存储。
     * 2、不可重复性：保证添加的对象，equals方法不可返回true，相同的元素只能添加一个
     * <p>
     * 添加对象的过程：（以HashSet为例）
     * 我们向hashset中添加元素a，首先调用a元素所在类的hashcode方法，计算a元素的哈希值，通过算法，找到元素在底层数组中存放的位置
     * 如果该位置上没有元素，则添加成功
     * 如果该位置上有其他元素，则先比较hashcode值 如果hashcode值不同则通过链表的形式添加
     * 如果hashcode值 相同则通过equals方法 判断 返回值为true 不添加 返回值为false 添加
     */

    @Test
    public void testSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(123);
        hashSet.add(456);
        hashSet.add(789);
        hashSet.add(10);

        hashSet.remove(10);

        for (Integer i : hashSet) {
            System.out.println(i);
        }

    }

    @Test
    public void testLinkedHashSet() {
        LinkedHashSet<Object> objects = new LinkedHashSet<>();
        objects.add(11);
        objects.add(12);
        objects.add(13);
        objects.add(14);
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }

    @Test
    public void testSort() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(28);

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testObj() {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("linda", 28));
        students.add(new Student("jack", 11));
        students.add(new Student("tom", 18));
        students.add(new Student("alex", 19));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test1() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    Student stu1 = (Student) o1;
                    Student stu2 = (Student) o2;
                    return Integer.compare(stu1.getGrade(),stu2.getGrade());
                }else {
                    throw new RuntimeException("wrong");
                }

            }
        };
        TreeSet<Student> students = new TreeSet<>(comparator);
        students.add(new Student("linda", 28));
        students.add(new Student("jack", 11));
        students.add(new Student("tom", 18));
        students.add(new Student("alex", 19));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
