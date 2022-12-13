//izza's,sir's program
package practice;

import java.io.DataOutputStream;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

    public class ThreadServer {
        public static void main(String[] args) throws Exception {
            System.out.println(InetAddress.getLocalHost());
            ServerSocket sock = new ServerSocket(3456);
            System.out.println("Waiting for Client");
            Socket host = sock.accept();
            System.out.println("Connection Established with: " + host.getInetAddress());

            DataOutputStream dout = new DataOutputStream(host.getOutputStream());
            DataInputStream din = new DataInputStream(host.getInputStream());

            Scanner scan = new Scanner(System.in);

            Thread reader = new Thread() {
                public void run() {
                    String str = " ";
                    while (!str.equals("CLOSE")) {
                        try {
                            str = din.readUTF();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Client Message: " + str);
                    }
                }
            };
            Thread writer = new Thread() {
                public void run() {
                    String serverMessage = " ";
                    while (!serverMessage.equals("CLOSE")) {
                        System.out.println("Enter Message: ");
                        serverMessage = scan.nextLine();
                        try {
                            dout.writeUTF(serverMessage);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

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
            sock.close();
        }
    }







