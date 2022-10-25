package exception_example_task;

public class Square extends Shape {
    private double l;
    private double length;

    Square(double length) {

        l = length;

    }

    public void getLength() throws Exception {
        try {
            if (l > 0) {
                this.length = l;
            } else
                throw new Exception("Negative");
        } catch (Exception e) {
        }
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    public static void main(String[] args) throws Exception {
        Square s = new Square(-10);
        s.getLength();
    }
}





