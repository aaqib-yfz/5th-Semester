package SocketProgamming.threads;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2{
    public static void main(String[] args) throws Exception{
        try {


            ServerSocket ss = new ServerSocket(5555);
            ss.setReuseAddress(true);
            System.out.println("waiting");
            Socket server = ss.accept();
            System.out.println("Connection Established");

            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));

            PrintWriter pw = new PrintWriter(server.getOutputStream());

            Thread reader = new Thread() {
                public void run() {
                    while (true) {
                        String data1 = null;

                        try {
                            data1 = br.readLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Data From Client:" + data1);
                    }
                }
            };
            Thread writer = new Thread(){
                public void run(){
                    while(true){
                    System.out.println("Enter The Data");
                    String data = sc.nextLine();
                    pw.println(data);
                    pw.flush();
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
