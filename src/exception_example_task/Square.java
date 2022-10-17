package exception_example_task;

public class Square extends Shape{
    private double l;
    private double length;
    Square(double length) throws Exception{

        l = length;
        if( l > 0)
            this.length = l;
        else
            throw new Exception();
    }


    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }
    public static void main(String[] args){
        try {
            Square s = new Square(-3);
            System.out.println(s.getArea());
        } catch (Exception e) {
            System.out.println("Negative Value");
        }

    }
}






