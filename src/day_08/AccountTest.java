package day_08;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(3000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getMonthlyInterest());
    }
}
