package day_11.duixiangbijiao;

/**
 * @author xiaoxia
 * @create 2020/11/25 4:46 下午
 */
public class ComparableCircle extends Circle implements CompareObject {
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            return this.getRadius() > ((ComparableCircle) o).getRadius() ? 1 : -1;
        } else {
            return 0;
        }
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
}
