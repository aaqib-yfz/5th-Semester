package threads_p;

public class incrementingThread extends Thread{
    Counter c ;
    public  incrementingThread(Counter c){
        this.c = c ;
    }
    public void run(){
        c.increment();
    }
}
