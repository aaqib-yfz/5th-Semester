package practice.twentynineDec;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",5555) ;
        System.out.println("Enter Data");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        String data = sc.nextLine();
        pw.println(data);
        pw.flush();
        pw.close();
        client.close();

    }
}
