package day_03;

public class Zhishu {
    public static void main(String[] args) {
        int flag = 1;
        for (int num = 3; num < 100; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i != 0) {
                    flag = 0;
                }else{
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(num);
            }

        }

    }
}
