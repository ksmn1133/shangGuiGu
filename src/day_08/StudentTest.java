package day_08;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "wangwu";
        st1.Id = 100L;
        st1.show();
        Person person =new Person();
        System.out.println(person.name);
    }
}
