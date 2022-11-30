package SocketProgamming;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client1 {
public static void main(String[] args) throws Exception{
    Socket host = new Socket("10.48.69.60",5555);
    // if conenction is established code after this will execute
    //we send string value to host using UTF
    DataOutputStream dout = new DataOutputStream(host.getOutputStream());
    // DataOutputStream allows us to send our desired data type
    dout.writeUTF("This is a Message from the client");
    dout.close();
    host.close();
}
}
