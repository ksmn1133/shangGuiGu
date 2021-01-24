package day_17;

/**
 * @author xiaoxia
 * @create 2020/12/28 9:27 上午
 */
public class Emp implements Comparable{
    int age;
    String name;
    public Emp(){

    }
    public Emp(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Emp){
            Emp emp2 = (Emp)o;
            return this.age - emp2.age;
        }else{
            return 0;
        }
    }
}
