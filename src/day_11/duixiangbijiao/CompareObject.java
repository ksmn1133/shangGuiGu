package day_11.duixiangbijiao;

/**
 * @author xiaoxia
 * @create 2020/11/25 4:41 下午
 */
public interface CompareObject {
    /**
     * compareTo抽象方法，比较两个对象的大小
     * 返回值若为0，则两个对象相等
     * 返回值为正数，则当前对象大
     * 返回值为负数，则当前对象小
     *
     * @param o
     * @return
     */
    int compareTo(Object o);
}
