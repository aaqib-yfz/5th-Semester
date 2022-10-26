//example 3
package Threads.SharedArrexp;

public class Write1 extends Thread {
    private int[] array  ;

   public Write1(int[] array) {
        this.array = array;
        System.out.println(array);
    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 ;
        }
    }
}