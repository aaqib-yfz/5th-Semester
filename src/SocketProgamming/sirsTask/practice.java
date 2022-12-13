package SocketProgamming.sirsTask;

import java.io.File;
import java.io.PrintWriter;

public class practice {
    public static void main(String[] args) throws Exception{
        File myFile = new File("filename.txt");
        if(!myFile.exists()){
            myFile.createNewFile();
        }
        PrintWriter pw = new PrintWriter(myFile);
        pw.println("This is me");
        pw.flush();
        System.out.println("Done");
    }
}
