package UDPExamples;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver1 {
    public static void main(String[] args) throws Exception{
        // pehle se space banaty jaha py packet receive karky set karsakein
        DatagramSocket receiver = new DatagramSocket(5555);
        byte[] buffer = new byte[1000];
        int length = buffer.length;
        DatagramPacket packet = new DatagramPacket(buffer,length);
        receiver.receive(packet);
        String str = new String(packet.getData());
        System.out.println(str);
    }
}
