package practice;

public interface gaari {
    void speedUp(int a );
    void speedDown(int a );

    public static void main(String[] args) {
        bike b = new bike();
        b.speedUp(200);
        b.speedDown(100);
        b.showDetails();
    }
}

class bike implements gaari{
    int speed;
    public void speedUp(int increment){
        this.speed += increment;
    }
    public void speedDown(int decrement){
        this.speed -= decrement;
    }
    public void showDetails(){
        System.out.print(speed);
    }
        }





