package practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpClient {
    public static void main (String[] args) throws Exception{
        DatagramSocket ds =  new DatagramSocket();
        String d = "hello";
        byte[] data = d.getBytes();
        int length = data.length;
        InetAddress in = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(data,length,in,5555);
        ds.send(dp);
    }
}
