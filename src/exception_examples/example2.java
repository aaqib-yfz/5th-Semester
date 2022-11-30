
package exception_examples;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args)  {
        try {
            Scanner scan = new Scanner(new File("/home/aaqib/Desktop/data.txt"));

            String str = scan.nextLine();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            System.out.println("file not found  bhai");

        }
    }
}
