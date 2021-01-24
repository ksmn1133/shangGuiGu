package day_11.duixiangbijiao;

/**
 * @author xiaoxia
 * @create 2020/11/25 4:58 下午
 */
public class Test {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(10);
        ComparableCircle c2 = new ComparableCircle(20);
        int num  =c1.compareTo(c2);
        System.out.println(num);
    }
}
