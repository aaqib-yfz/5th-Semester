package Playground;


public class main  extends Counter {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        IncrementingThread inc1 = new IncrementingThread(c);
        IncrementingThread inc2 = new IncrementingThread(c);
        inc1.start();
        inc2.start();
        try {
            inc1.join();
            inc2.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            c.displayCount();
        }
    }

}
