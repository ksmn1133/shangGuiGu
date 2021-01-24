package day_07;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());

        System.out.println(new Person(20,"gou").getAge());

    }
}
