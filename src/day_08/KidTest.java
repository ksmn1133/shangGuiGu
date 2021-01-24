package day_08;

public class KidTest {
    public static void main(String[] args) {
        Kids someKids = new Kids(20);
        someKids.setSex(1);

        int salary = someKids.getSalary();

        someKids.employed(salary);


    }
}
