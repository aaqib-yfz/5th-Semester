package UDPExamples;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender1 {
    public static void main(String[] args) throws Exception{
        DatagramSocket sender = new DatagramSocket(8888); //local port no
        String msg = "Hello this is the data we are sendng using packets";
        byte [] data = msg.getBytes();
        int length = data.length;
        InetAddress ip = InetAddress.getByName("localhost");
        int port = 5555; // destination port no
        DatagramPacket packet = new DatagramPacket(data,length,ip,port);
        sender.send(packet);
    }
}
