package day_06;

import day_07.Order;

public class AreaTest{
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(4);
        System.out.println(circle1.findArea());
        System.out.println("==================");
        PassObject po = new PassObject();
        po.printAreas(new Circle(),5);

        System.out.println("============");


        Order order = new Order();
        order.publicNum = 1;
        order.publicMethod();

    }
}
