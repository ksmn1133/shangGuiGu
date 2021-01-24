package day_06;

public class Circle {
    private double radius;
    public double findArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public Circle() {
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
