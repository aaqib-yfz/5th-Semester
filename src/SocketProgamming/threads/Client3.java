package SocketProgamming.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client3 {

    public static void main(String[] args) throws Exception{
        try {
            Socket client = new Socket("localhost", 5555);
            System.out.println("CLient Connected");
            //send data to server
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

            PrintWriter pw = new PrintWriter(client.getOutputStream());
            Thread reader = new Thread() {
                public void run() {
                    while (true) {
                        String data1 = null;

                        try {
                            data1 = br.readLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Data From Server:" + data1);
                    }
                }
            };
            Thread writer = new Thread() {
                public void run() {
                    while (true) {
                        System.out.println("Enter The Data");
                        String data = sc.nextLine();
                        pw.println(data);
                        pw.flush();
                        if(data == "stop"){
                            break;
                        }
                    }
                }
            };
            reader.start();
            writer.start();
            reader.join();
            writer.join();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}



