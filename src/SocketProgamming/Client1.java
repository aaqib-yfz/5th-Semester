package SocketProgamming;

import com.sun.source.tree.WhileLoopTree;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
public static void main(String[] args) throws Exception{
    Socket host = new Socket("192.168.18.133",5555);
    // if connection is established code after this will execute
    //we send string value to host using UTF

    DataOutputStream dout = new DataOutputStream(host.getOutputStream());
    // DataOutputStream allows us to send our desired data type
    dout.writeUTF("This is a Message from Aaqib's Client");
    Scanner sc = new Scanner(System.in);


    DataInputStream din = new DataInputStream(host.getInputStream());
    System.out.println(din.readUTF());

    dout.close();
    host.close();
}
}



