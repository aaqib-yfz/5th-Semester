package Threads.twenty_fifth_oct_exmp;

public class DecrementingThread extends Thread{
private Counter f;
public DecrementingThread(Counter f){
    this.f = f;
}
public void run(){
    f.decrement();
}
}