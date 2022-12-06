package SocketProgamming;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//tcp connection
public class Server1 {
    public static void main(String[] args) throws Exception{
        System.out.println(InetAddress.getLocalHost());
        ServerSocket sock = new ServerSocket(5555); // 5555 py listen karna he clients ko
        Socket host =  sock.accept(); //server will be blocked until clients  get connected ,ip + port = socket
        System.out.println("Connection Established");

        DataInputStream din = new DataInputStream(host.getInputStream()); // reads message from client
         String Str = din.readUTF();
         System.out.println(Str);

        DataOutputStream dout = new DataOutputStream(host.getOutputStream());

        // DataOutputStream allows us to send our desired data type
        dout.writeUTF("Silamalikum Aaqib's Server Says thankyou" + " " + Str);

        host.close();
        sock.close();
    }
}
