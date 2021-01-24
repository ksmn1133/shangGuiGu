package day_08;

public class CheckAccount extends Account {
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= super.getBalance()) {
            setBalance(super.getBalance() - amount);
            System.out.println("withdraw :" + amount + "balance is :" + super.getBalance());
        } else {
            double over = amount - super.getBalance();
            if (over <= getOverdraft()) {

                super.setBalance(0);

                setOverdraft(getOverdraft() - over);

                System.out.println("the balance is : 0 \t the overdraft is :" + getOverdraft());
            } else {
                System.out.println("no money!");
            }
        }
    }
}
