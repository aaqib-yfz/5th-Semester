package SocketProgamming.sirsTask;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception{
        ServerSocket  ss=new ServerSocket(5655);
        System.out.println("Waiting for Client: ");
        Thread t= new Thread(() -> {
            while (true) {
                try {
                    Socket server=ss.accept();

                    System.out.println("Connection Established with: "  + server.getInetAddress());


                    ClientHandler ch=new ClientHandler(server);
                    ch.start();

                }
                catch (IOException e) { e.printStackTrace(); }
            }
        });
        t.start();
        t.join();

    }
}
class ClientHandler extends Thread{
    private Socket s;

    public ClientHandler(Socket s) {
        this.s=s;
    }
    FileWriter fr;
    BufferedReader br;
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            fr=new FileWriter("final.txt" ,true);
            String data = br.readLine();
            fr.write(data +"\n");
            br.close();
            fr.close();
        }
        catch(Exception e) { System.out.println(e);	}

    }
}


