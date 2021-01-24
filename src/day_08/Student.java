package day_08;

public class Student extends Person{
    Long Id;



    public void show(){
        System.out.println(Id+"\t" + super.name);
    }

}
