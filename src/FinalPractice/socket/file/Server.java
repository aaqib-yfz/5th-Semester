package FinalPractice.socket.file;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5555);
        System.out.println("waiting");

        Thread t = new Thread(){
            public void run(){
                while(true) {
                    try {
                        Socket server = ss.accept();
                        System.out.println("Connection Established with " + server.getInetAddress());
                        clientHandler ch = new clientHandler(server);
                        ch.start();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t.start();
        t.join();
    }
    public static class clientHandler extends Thread {
        public Socket s;

        public clientHandler(Socket s) {
            this.s = s;
        }

        public void run() {
            try {
                FileWriter fw = new FileWriter("finalPractice.txt", true);
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String data = br.readLine();
                fw.write(data + " \n " );
                fw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}














