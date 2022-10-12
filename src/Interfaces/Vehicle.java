package Interfaces;
interface Vehicle{
    void changeGear(int a);
    void speedUp(int a );
    void speedDown(int a );

    static void main(String[] args) {
                bike b = new bike();
                b.changeGear(5);
                b.speedUp(20);
                b.speedDown(10);
                b.printState();
    }
}
  class bike implements Vehicle {

    int gear;
    int speed;
    public void changeGear(int gear){
        this.gear = gear;
    }
    public void speedUp(int increment){
        this.speed = speed + increment;
    }
    public void speedDown(int decrement){
        this.speed = speed - decrement;
    }
    public void printState(){
        System.out.print("Speed: " + speed + "Gear: " + gear);
    }
}

