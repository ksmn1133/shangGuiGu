package day_11;

/**
 * @author xiaoxia
 * @create 2020/11/25 2:18 下午
 */
public class HardDisk implements Usb{
    private String name;
    private double price;

    public HardDisk(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public HardDisk() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println("name:"+name+"\t"+"price"+price+"start!");
    }

    @Override
    public void stop() {
        System.out.println("name:"+name+"\t"+"price"+price+"stop!");
    }
}
