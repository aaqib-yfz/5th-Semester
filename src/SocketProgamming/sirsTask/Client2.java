package SocketProgamming.sirsTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws Exception {
        Socket client=new Socket("localhost",5655);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name or Class No: ");
        String str=sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String data = br.readLine();
        System.out.println(data);
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println(str);
        pw.close();
        br.close();



    }
}