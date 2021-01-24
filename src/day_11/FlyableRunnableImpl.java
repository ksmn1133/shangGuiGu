package day_11;

/**
 * @author xiaoxia
 */
public class FlyableRunnableImpl extends Object implements Flyable,Runnable{
    @Override
    public void method() {
        System.out.println("the method in class Plane is executed");
    }
}
