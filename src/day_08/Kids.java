package day_08;

public class Kids extends Mankind {
    private int yearsOld;

    public void printAge(int yearsOld) {
        System.out.println(yearsOld);
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void employed(int s){
        System.out.println("kids dont have to work!");

    }


}
