package Threads.ProducerConsumer;

//import java.util.Collection;
import java.util.LinkedList;

public class MainClass{
    public static void main(String [] args) {
//	    LinkedList <Integer> buffer;
        LinkedList <Integer> buffer = new LinkedList();
        Producer pro = new Producer(buffer);
        Consumer con = new Consumer(buffer);
        pro.start();
        con.start();
        try {
            pro.join();
            con.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}