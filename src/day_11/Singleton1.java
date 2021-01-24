package day_11;
//singleton 懒汉
public class Singleton1 {
    //私有化构造器，其他类中不能直接构造该类对象
    private Singleton1 (){

    }
    static Singleton1 obj = null;

    public static Singleton1 getInstance(){
       if(obj == null){
           obj = new Singleton1();
           return obj;
       }else{

           return obj;
       }
    }
}
