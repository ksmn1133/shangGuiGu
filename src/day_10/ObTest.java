package day_10;

import day_07.Person;

import java.util.Arrays;

public class ObTest {
    public static void main(String[] args) {
        Ob ob1 = new Ob();

        boolean  isEqual = ob1.equals(new Ob());
        System.out.println("isEqual = " + isEqual);

        int i = ob1.hashCode();
        System.out.println(i);

        String s = ob1.toString();
        System.out.println(s);

        Class<? extends Ob> aClass = ob1.getClass();
        System.out.println(aClass);

        Class<?> superclass = ob1.getClass().getSuperclass();
        System.out.println(superclass);

        Object ob2 = new Person();
        System.out.println(ob2.getClass());

    }
}
