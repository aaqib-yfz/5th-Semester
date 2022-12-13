package SocketProgamming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


        import java.net.Socket;
        import java.util.Scanner;

 public class client21{
        public static void main(String[] args){
            try{
                Socket client = new Socket("localhost",5555);
                System.out.println("CLient Connected");
                //send data to server
                Scanner sc = new Scanner(System.in);
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

                PrintWriter pw = new PrintWriter(client.getOutputStream());
                while(true){
                    System.out.println("Enter The Data");
                    String data = sc.nextLine();
                    pw.println(data);
                    pw.flush();
                    String data1 = br.readLine();
                    System.out.println("Data From Server:" + data1);
                }

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

