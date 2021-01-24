package day_11;

/**
 * @author xiaoxia
 */
public abstract class Employee {
    private String name;
    private int number;
    MyDate birthday;

    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday +
                '}';
    }


}
