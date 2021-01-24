package day_13.T6;

import java.util.Scanner;

/**
 * @author xiaoxia
 * @create 2020/12/1 8:04 下午
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("how many do you want to buy?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Consumer.setBuyNumber(num);
        Clerk clerk = new Clerk();
        Producer producer1 = new Producer();
        Thread t1 = new Thread(clerk);
        t1.setName("clerkThread");
        Thread t2 = new Thread(producer1);
        t2.setName("producerThread");
        t1.start();
        t2.start();
    }
}
