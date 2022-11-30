package threads_p;

import java.util.LinkedList;

public class producer extends Thread {
   private LinkedList<Integer> b;
   public  producer(LinkedList<Integer> b){
       this.b = b;
   }
   public void run(){
      synchronized (b){
         for (int i = 0; i<=b.size(); i++){
            if(b.size() ==10)
               try {
                  b.wait();
               }catch(Exception e){
                  e.printStackTrace();
               }
            b.add(i);
            b.notify();
            System.out.print("The value of i is "+ i);
         }
      }
   }

}





