package SocketProgamming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5555);
        Socket server = ss.accept();
        System.out.println("connected");

        DataInputStream din = new DataInputStream(server.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));

        while(true){
            String data = br.readLine();
            System.out.println("Client:" + data);
        break;
        }
        din.close();
        server.close();

    }

}






