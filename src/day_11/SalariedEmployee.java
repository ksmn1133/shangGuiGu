package day_11;

import java.util.Date;

public class SalariedEmployee extends Employee{
    private double monthlySalary;
    @Override
    public double earnings() {

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);



        if( birthday.getMonth() == time){
            monthlySalary+=100;
        }



        return monthlySalary;
    }

}
