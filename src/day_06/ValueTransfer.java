package day_06;

public class ValueTransfer {
    public static void main(String[] args) {
        int m =10;
        int n = 20;
        transferNum(10,20);

    }

    public static void transferNum(int m ,int n){
        int temp = m;
        m =n;
        n = temp;
        System.out.println(m+"\t"+n);
    }
}
