package FinalPractice.socket.multiclient;

import practice.ThirtyDec.Server;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static  void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5555);
        System.out.println("Waiting");
        Thread t = new Thread(){
            public void run(){
                while(true){
                    try {
                        Socket server = ss.accept();
                        System.out.println("Connected");
                        clientHandler ch = new clientHandler(server);
                        ch.start();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    }
            }
        };
        t.start();
        t.join();
    }
    public static class clientHandler extends Thread{
           public Socket s;
            public clientHandler(Socket s){
                this.s = s;
            }
            public void run(){
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String data = br.readLine();
                    System.out.println("Data From" +" " + s.getInetAddress() +" "+ data);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
    }
}









