package day_08;

public class Cylinder extends Circle {
    private double length;

    public double findVol() {
        System.out.println(super.findArea() * length);
        return super.findArea() * length;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
