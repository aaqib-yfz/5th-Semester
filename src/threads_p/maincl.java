package threads_p;

public class maincl extends Counter{
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        incrementingThread i1 = new incrementingThread(c);
        incrementingThread i2 = new incrementingThread(c);
        decrementingThread d1 = new decrementingThread(c);
        decrementingThread d2 = new decrementingThread(c);

        i1.start();
        i2.start();
        d1.start();
       d2.start();
try {
    i1.join();
    i2.join();
    d1.join();
    d2.join();
}catch(InterruptedException e){
    e.printStackTrace();
}
finally {
    c.displayCount();
}


    }
}
