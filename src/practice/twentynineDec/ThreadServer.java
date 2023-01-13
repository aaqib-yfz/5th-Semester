package practice.twentynineDec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ThreadServer {
    public static void main(String[] args) throws Exception {


    ServerSocket ss = new ServerSocket(5555);
    System.out.println("Wating");
    Socket server = ss.accept();
    System.out.println("Connection Established ");

      Thread  reader = new Thread(){
         public void  run(){
             while(true) {
             try {
                 BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
                 String data = br.readLine();

                 System.out.println("Data From Client:" + data);
             } catch (IOException e) {
                 throw new RuntimeException(e);}

             }
             }
      } ;
      Thread writer  = new Thread(){
          public void run(){
              while (true) {
              System.out.println("Enter Data");

              Scanner sc = new Scanner(System.in);

              try {

                      PrintWriter pw = new PrintWriter(server.getOutputStream());
                      String data = sc.nextLine();
                      pw.println(data);
                      pw.flush();

                  } catch(IOException e){
                      throw new RuntimeException(e);
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











