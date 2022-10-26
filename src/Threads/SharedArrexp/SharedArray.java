package Threads.SharedArrexp; // example3 20/10/22
// join () use
public class SharedArray {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[10];
        Write1 t1 = new Write1(array);
        write7 t7 = new write7(array);
        t1.start();
        t7.start();
        try {
            t1.join();
            t7.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i =0; i< array.length; i++){
            System.out.println( array[i]);
        }
    }
}
