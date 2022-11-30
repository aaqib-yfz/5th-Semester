// method local inner class
package inner_class;

public class Outer2 {
    public void outerMethod(){
        System.out.println("inside outerMethod");
        class inner{
            public void innerMethod(){
                System.out.println("inside innerMethod");
            }
        }
        inner y = new inner();
        y.innerMethod();
    }
public static void main(String[] args){
        Outer2 x = new Outer2();
        x.outerMethod();
        
}
}
