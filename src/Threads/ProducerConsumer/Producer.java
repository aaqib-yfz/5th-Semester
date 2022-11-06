package Threads.ProducerConsumer;

import java.util.LinkedList;


public class Producer extends Thread{
    private LinkedList<Integer> buffer;
    public Producer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }
    public void run() {
//		for(int i = 0; i <= 10; i++) {
        synchronized (buffer){
            for(int i = 0; i <= 10; i++) {
                if(buffer.size() == 10) {
                    try {
                        buffer.wait();
                        System.out.println("Thread will be sent to ready state");
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }
                buffer.add(i);
                buffer.notify();
                System.out.println("The value of i is " + i ) ;
            }
        }

    }
}