package day_17;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author xiaoxia
 * @create 2020/12/22 5:24 下午
 */
public class Student implements Comparable{
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student stu = (Student) o;
            return this.name.compareTo(stu.name);

        }else{
            System.out.println("wrong!");
            return 0;
        }


    }
}
