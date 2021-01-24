package day_09;

public class Poly {
    public static void main(String[] args) {
        Person person = new Man("zhangsan",20,true);
        person.eat();


        Person p1 =new Man();

        if(p1 instanceof Person){

            Man m1 =(Man)p1;
        }else{
            System.out.println("wrong");
        }


    }

}
