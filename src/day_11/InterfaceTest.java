package day_11;

public class InterfaceTest {
    public static void main(String[] args) {
        double maxSpeed = Flyable.MAX_SPEED;
        System.out.println(maxSpeed);
        FlyableRunnableImpl frImpl = new FlyableRunnableImpl();
        frImpl.method2();
    }
}
