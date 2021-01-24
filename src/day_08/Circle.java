package day_08;

public class Circle {
    private double radius;
    public double  findArea(){
        double areaOfC = Math.PI*radius*radius;
        return areaOfC;
    }

    public Circle() {
        radius = 2;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
