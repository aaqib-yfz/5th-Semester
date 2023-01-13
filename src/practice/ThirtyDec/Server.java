package practice.ThirtyDec;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static  void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5555);
        System.out.println("Waiting For Connection");
        Thread t = new Thread(){
            public void run(){
                while(true){
                    try {
                        Socket server = ss.accept();
                        System.out.println("Connection Established" + server.getInetAddress());
                        ClientHandler ch = new ClientHandler(server);
                        ch.start();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        t.start();
        t.join();
    }
     static class ClientHandler extends Thread{
        private  Socket s;
            public ClientHandler(Socket s){
                this.s = s;
            }

            public void run(){
                try{
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    FileWriter fw = new FileWriter("final2.txt",true);
                    String data =  br .readLine();
                    fw.write(data + " \n");
                    br.close();
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

    }
}











