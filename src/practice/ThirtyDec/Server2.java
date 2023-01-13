package practice.ThirtyDec;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static  void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5555);
        System.out.println("Waiting for connection");

        Thread t = new Thread(){

            public void run() {
                while (true) {
                    try {
                        Socket server = ss.accept();
                        System.out.println("connection Established");
                        ClientHandler ch = new ClientHandler(server);
                        ch.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t.start();
        t.join();
    }
    public static class ClientHandler extends Thread {
       private Socket s ;
        public ClientHandler(Socket s){
            this.s = s ;
        }
        public void run(){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                FileWriter fw = new FileWriter("final4.txt",true);
                String data = br.readLine();
                fw.write(data + "\n");
                fw.close();
                br.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }
        }
}









