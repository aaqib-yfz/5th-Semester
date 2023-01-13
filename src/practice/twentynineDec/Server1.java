package practice.twentynineDec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws Exception{
       ServerSocket ss = new ServerSocket(5555);
       System.out.println("waiting for connection");
       Socket server = ss.accept();
       System.out.println("Connection Established");

       BufferedReader br = new BufferedReader( new InputStreamReader(server.getInputStream()));
       String data = br.readLine();
       System.out.println("Data From Client " + " " + data);

    }
}
