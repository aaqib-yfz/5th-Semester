package FinalPractice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class monicaServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5555);

        Thread t = new Thread() {
            public void run() {
                while (true) {
                    byte[] b = new byte[10];
                    int length = b.length;
                    DatagramPacket dp = new DatagramPacket(b, length);
                    try {
                        ds.receive(dp);
                        String data = new String(dp.getData());
                        System.out.println(data);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }


                }
            }
        };
        t.start();
        t.join();
    }
}





