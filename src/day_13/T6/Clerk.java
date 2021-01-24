package day_13.T6;

/**
 * @author xiaoxia
 * @create 2020/12/1 8:04 下午
 */
public class Clerk implements Runnable {
    private int numClerk = 20 - Consumer.getBuyNumber();
    static Producer producer = new Producer();

    @Override
    public void run() {
        synchronized (producer) {
            if (numClerk < 20 && numClerk > 0) {
                producer.notify();
                System.out.println("the number of commodity in the shop is :" + numClerk);
            } else {
                try {
                    producer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
