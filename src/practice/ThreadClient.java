package practice;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ThreadClient {

    public static void main(String[] args) throws Exception{
        Socket host=new Socket("localhost",3456);

        DataOutputStream dout=new DataOutputStream(host.getOutputStream());
        DataInputStream din=new DataInputStream(host.getInputStream());

        Scanner scan=new Scanner(System.in);

        Thread writer=new Thread() {
            public void run() {
                String clientMessage=" " ;
                while(!clientMessage.equals("CLOSE")) {
                    System.out.println("Enter Message: ");
                    clientMessage=scan.nextLine();
                    try {
                        dout.writeUTF(clientMessage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }

        };

        Thread reader=new Thread() {
            public void run() {
                String str=" ";
                while(!str.equals("CLOSE")) {
                    try {
                        str=din.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Server Message: " + str);
                }
            }
        };


        reader.start();
        writer.start();
        reader.join();
        writer.join();

        din.close();
        dout.close();
        host.close();
    }

}
