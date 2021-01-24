package day_08;

import org.w3c.dom.ls.LSOutput;

public class Mankind {
    private int sex;
    private int salary;

    public void manOrWoman(int sex) {
        switch (sex) {
            case 1:
                System.out.println("man");
            case 0:
                System.out.println("woman");
        }

    }

    public void employed(int salary) {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("have job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Mankind() {
    }

    public Mankind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }
}
