package FinalPractice.fileHandling;

import java.io.*;
import java.util.Scanner;

public class first {
    public static void main(String[] args) throws IOException {
        File f = new File("eightpm");
        FileWriter fw = new FileWriter(f,true);
        Scanner sc = new Scanner(System.in);
        int data = Integer.parseInt(sc.nextLine());

        fw.write(data );
        fw.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
          int data1 = Integer.parseInt(br.readLine());
        System.out.println(data1);


    }
}
