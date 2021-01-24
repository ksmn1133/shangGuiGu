package day_06;

public class PassObject {
    public void printAreas(Circle c,int time){
        for(int i = 1;i<=5;i++){
            c.setRadius(i);
            System.out.println("the radius is "+c.getRadius()+",and the area is "+c.findArea());
        }
    }
}
