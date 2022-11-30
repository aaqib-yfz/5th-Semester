package threads_p;

import java.util.LinkedList;

public class consumer extends Thread{
    private LinkedList<Integer> b;
    public consumer(LinkedList<Integer> b){
        this.b= b;

    }
    public void run(){
        synchronized (b){
            for (int i=0; i<b.size(); i++){
                if(b.size()==0){
                    try {
                        b.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    b.remove();
                    b.notify();
                }
            }
        }

    }
}


