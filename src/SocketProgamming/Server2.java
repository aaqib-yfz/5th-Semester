
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2{
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(5555);
            System.out.println("waiting");
            Socket server = ss.accept();
            System.out.println("Connection Established");
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
            PrintWriter pw = new PrintWriter(server.getOutputStream());
            while (true){
                System.out.println("Enter The Data");
                String data1 = sc.nextLine();
                pw.println(data1);
                pw.flush();
                String data = br.readLine();
                System.out.println("Data From Client:" + data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
