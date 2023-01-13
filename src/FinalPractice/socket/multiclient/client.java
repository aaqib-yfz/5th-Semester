package FinalPractice.socket.multiclient;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws  Exception{
            Socket client = new Socket("localhost",5555);
            System.out.println("connected");
            while(true){
                System.out.println("Enter Your name");
                Scanner sc = new Scanner(System.in);
                String data = sc.nextLine();
                PrintWriter pw = new PrintWriter(client.getOutputStream());
                pw.println(data);
                pw.flush();
                pw.close();
            }
            }

}



