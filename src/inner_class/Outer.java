// nested inner
package inner_class;

public class Outer {
    int a, b;

    public Outer() {

    }
    public void outerShow(){
        System.out.println("this is outer class");
    }


    class inner {
        public void show() {
            System.out.println("This is inner class");
        }
        static void m1(){
            class innerKyandar {
                public void show() {
                    System.out.println("hello");
                }
            }
        }
    }
    public static void main(String[] args){
        Outer.inner i = new Outer().new inner();
            i . show();
            Outer u = new Outer();
            u.outerShow();

        }
}







