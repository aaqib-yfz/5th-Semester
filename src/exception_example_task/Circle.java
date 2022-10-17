package exception_example_task;

import java.net.CacheRequest;

public class Circle extends Shape {
    public int diameter;
    private int radius;
    private int r;
    private double area;
    private double perimeter;
    Circle(int diameter){
        this.diameter = diameter;
    }
    public int getDiameter(){
        return diameter;
    }
    public void setRadius() throws Exception {

        this.radius = (diameter/2);
        if (radius > 0)
           r =  radius  ;
        else
            throw new Exception();
    }
    @Override
    public double getArea() {
        return this.area = (3.14*r*r);
    }
     public  void printRad(){
        System.out.println(r);
     }
    @Override
    public double getPerimeter() {
        return this.perimeter = 2*3.14*r;
    }
    public static void main(String[] args) throws Exception {
        Circle c = new Circle(10);

        try {
            c.setRadius();

        } catch (Exception e) {
           System.out.println("Negative Value");
           e.printStackTrace();
        }
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }

}








