package threads_p;

public class decrementingThread extends Thread{
       private Counter c;
       public decrementingThread(Counter c){
           this.c = c;
       }
        public void run(){
            c.decrement();
        }
}
