package practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(5555);
        byte[] buffer = new byte[10];
        int length = buffer.length;
        DatagramPacket dp = new DatagramPacket(buffer,length);

        ds.receive(dp);
        String str = new String(dp.getData());
        System.out.println(str);

    }
}
