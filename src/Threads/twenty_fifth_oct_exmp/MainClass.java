package Threads.twenty_fifth_oct_exmp;

public class MainClass extends  Counter{

        public static void main(String[] args) throws InterruptedException {
            Counter c = new Counter();
            IncrementingThread inc1 = new IncrementingThread(c);
            IncrementingThread inc2 = new IncrementingThread(c);

            DecrementingThread dec1 = new DecrementingThread(c);
            DecrementingThread dec2 = new DecrementingThread(c);
            inc1.start();
            inc2.start();
            dec1.start();
            dec2.start();
            try {
                inc1.join();
                inc2.join();
                dec1.join();
                dec2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally{
                c.displayCount();
            }
        }

    }
