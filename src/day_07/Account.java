package day_07;

public class Account {
    private long id;
    private double balance;
    private double interestRate;

    public void deposit(double rmbIn){
        if(rmbIn<=0){
            System.out.println("wrong");
        }else{
            this.balance += rmbIn;
            System.out.println("deposite done");
        }
        System.out.println(this.id+"the balance is "+this.balance);
    }

    public void withdraw(double rmbOut){
        if(rmbOut<=0||balance<rmbOut){
            System.out.println("wrong");
        }else{
            this.balance -= rmbOut;
            System.out.println("withdraw done");
        }

        System.out.println(id+"the balance is"+this.balance);
    }


    public Account() {
    }

    public Account(long id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



}
