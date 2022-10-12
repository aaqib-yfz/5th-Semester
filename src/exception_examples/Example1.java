package exception_examples;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = s1.nextInt();
        int n = 0 ;
        try {
            n = s1.nextInt();
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        catch (InputMismatchException e ){
            System.out.println("you Entered String");
        }
        System.out.println("The Value Entered is : " + num);

    }
}
