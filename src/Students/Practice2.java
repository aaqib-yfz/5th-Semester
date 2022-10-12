package Students;

public class Practice2  implements abc,xyz{


    @Override
    public int turnRight() {
        System.out.println("Turned Right");
        return 0;

    }

    public int turnLeft(){
        System.out.println("Turned Left");
        return 0;
    }


    public static void main(String[] args){
        Practice2  s = new Practice2();
        s.turnRight();
        s.turnLeft();
    }
}








