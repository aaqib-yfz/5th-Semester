package FinalPractice.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",5555);
        System.out.println("Connected");

        Thread writer = new Thread(){
            public void run() {
                while (true) {
                    System.out.println("Enter Your Message");
                    Scanner sc = new Scanner(System.in);
                    String data = sc.nextLine();
                    if(data.equals("stop")){
                        break;
                    }
                    try {
                        PrintWriter pw = new PrintWriter(client.getOutputStream());
                        pw.println(data);
                        pw.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread reader = new Thread(){
            public void run(){
                while(true) {

                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        String data = br.readLine();
                        if(data.equals("stop")){
                            break;
                        }
                        System.out.println("Data From Server + " + data);
                    } catch (RuntimeException | IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        writer.start();
        reader.start();
        writer.join();
        reader.join();
        client.close();
    }

}






