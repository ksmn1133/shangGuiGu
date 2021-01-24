package day_09;

public class Woman extends Person{
    private boolean isMakingUp;

    public boolean isMakingUp() {
        return isMakingUp;
    }

    public Woman(boolean isMakingUp) {
        this.isMakingUp = isMakingUp;
    }


    public Woman(String name, int age, boolean isMakingUp) {
        super(name, age);
        this.isMakingUp = isMakingUp;
    }

    public void setMakingUp(boolean makingUp) {
        isMakingUp = makingUp;
    }

    @Override
    public void eat() {
        System.out.println("woman can eat vegetables");
    }

    @Override
    public void walk() {
        System.out.println("woman can walk slow");
    }


}
