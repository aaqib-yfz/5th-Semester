package Threads.ProducerConsumer;
import java.util.LinkedList;
public class Consumer extends Thread{
    private LinkedList<Integer>buffer;
    public Consumer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for(int i = 0; i <= 10; i++) {
            synchronized (buffer){

                if(buffer.size() == 0) {
                    try {
                        buffer.wait();
                        System.out.println("The wait call is sent to producer to add elements");
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }
                buffer.remove();

//				int num = (int)buffer.remove();
                buffer.notify();
            }
            System.out.println("THE value of removed i is " + i);
        }

    }
}