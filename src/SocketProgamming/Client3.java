package SocketProgamming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

public class Client3 {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost",5555);
        DataOutputStream dout = new DataOutputStream(client.getOutputStream());
        System.out.println("write Something");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            dout.writeUTF(s);
            break;
           }
        client.close();
    }
}
