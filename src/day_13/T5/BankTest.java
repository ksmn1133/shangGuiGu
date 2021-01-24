package day_13.T5;

/**
 * @author xiaoxia
 * @create 2020/12/1 1:48 下午
 */
public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(bankAccount);
        Thread t2 = new Thread(bankAccount);

        t1.start();
        t2.start();

    }

}
