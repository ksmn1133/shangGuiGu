package day_14.Compare;

import java.util.Comparator;

/**
 * @author xiaoxia
 * @create 2020/12/8 10:05 上午
 */
public class Mouse implements Comparable , Comparator {
    private String name;
    private double price;

    public Mouse() {

    }

    public Mouse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mouse) {
            Mouse o1 = (Mouse) o;
            if (o1.getPrice() > this.price) {
                return -1;
            } else if (o1.getPrice() < this.price) {
                return 1;
            } else{
                return 0;
            }

        } else {
            try {
                throw new Exception("wrong!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
