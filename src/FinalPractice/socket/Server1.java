package FinalPractice.socket;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
        public static void main(String[] args) throws Exception{
            ServerSocket ss = new ServerSocket(5555);
            System.out.println("Waiting");
            Socket server = ss.accept();
            System.out.println("connected");

            Thread reader = new Thread(){
                public void run(){
                    while(true) {
                        try {
                            BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
                            String data = br.readLine();
                            if(data.equals("stop")){
                                break;
                            }
                            System.out.println("Data From Client: " + data);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            Thread writer = new Thread(){
               public void run(){
                   while(true) {

                           System.out.println("Write A Message To Server:");
                           Scanner sc = new Scanner(System.in);
                           String data = sc.nextLine();
                           if(data.equals("stop")){
                               break;
                           }
                       try {

                           PrintWriter pw = new PrintWriter(server.getOutputStream());
                           pw.println(data);
                           pw.flush();
                       } catch (Exception e) {
                           e.printStackTrace();
                       }
                   }
               }
            };
            reader.start();
            writer.start();
            reader.join();
            writer.join();
            server.close();
        }


}






