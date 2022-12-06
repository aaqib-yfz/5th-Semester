package practice;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serverp1 {
    public static void main(String[] args){
    try{
    ServerSocket ss = new ServerSocket(5555);
        Socket server = ss.accept();
        System.out.println("Connection Estblished");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(server.getOutputStream());
        while(true){
            System.out.println("Enter Data");
            String data = sc.nextLine();
            pw.println(data);
            pw.flush();
        }
    } catch(Exception e){
        System.out.println(e);
    }
}
}
