package practice.ThirtyDec;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client2 {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",5555);
        System.out.println("Connected");

        System.out.println("Enter Your Name:");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println(data);
        pw.flush();
        sc.close();
        client.close();
    }
}
