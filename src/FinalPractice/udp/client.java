package FinalPractice.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class client {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        String data = "hi";
        byte[] dataB = data.getBytes();
        int length = dataB.length;
        InetAddress Adress = InetAddress.getByName("localhost");
        int port = 5555;
        DatagramPacket dp = new DatagramPacket(dataB,length,Adress,port);
        ds.send(dp);
    }
}
