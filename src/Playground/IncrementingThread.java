package Playground;

public class IncrementingThread extends Thread {
    private Counter c;
    public IncrementingThread(Counter c){
        this.c = c ;
    }
    public void run(){
        c.increment();
    }

}
