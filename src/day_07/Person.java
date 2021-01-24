package day_07;

public class Person {
    public Person() {
        age = 18;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compare(Person person){
        if(this.getAge()>=person.getAge()){
           return -1;
        }else{
            return 1;
        }
    }
    private void show(){
        System.out.println("show!");
    }
}
