package day_09;

public class Man extends Person{
    private boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("man can eat meat");
        isDrive();
    }

    @Override
    public void walk() {
        System.out.println("man can walk fast");
    }
    public void isDrive(){
        System.out.println("man can drive");
    }

    public Man() {
    }

    public Man(boolean isSmoking) {
        this.isSmoking = isSmoking;
    }

    public Man(String name, int age, boolean isSmoking) {
        super(name, age);
        this.isSmoking = isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }
}
