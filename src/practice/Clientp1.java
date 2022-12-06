package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Clientp1 {
    public static void main(String[] args){
        try{
            Socket client = new Socket( "localhost",5555);
            System.out.println("hi");

            BufferedReader br = new BufferedReader(new InputStreamReader( client.getInputStream()));
            while (true){
                String data = br.readLine();
                System.out.println("Data From Server :" + data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
