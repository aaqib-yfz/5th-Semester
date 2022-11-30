package threads_p;

public class Counter {
    int count = 0;
    public synchronized void increment(){
        for(int i =0; i < 1000; i++){
            count +=1;
        }
    }
    public synchronized void decrement(){
            for(int i =0; i < 1000; i++){
                count -=1;

            }

        }
    public void displayCount(){
        System.out.println(count);
    }
}
