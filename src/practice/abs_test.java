package practice;

public class abs_test extends abs{
    void move(){
        System.out.print("move of parent that is abstract");
    }
    public void fun(){
        System.out.print("hi");
    }
    public static void main(String[] args){
        abs_test a = new abs_test();
        a.fun();
    }

}
