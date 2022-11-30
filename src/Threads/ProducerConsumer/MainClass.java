package Threads.ProducerConsumer;

//import java.util.Collection;
import java.util.LinkedList;

public class MainClass{
    public static void main(String [] args) {
//	    LinkedList <Integer> buffer;
        LinkedList <Integer> b = new LinkedList<Integer>();
        Producer pro = new Producer(b);
        Consumer con = new Consumer(b);
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