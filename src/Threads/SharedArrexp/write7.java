//example 3
package Threads.SharedArrexp;

public class write7 extends Thread {
    private int[] array  ;

  public  write7(int[] array) {
        this.array = array;
        System.out.println(array);

    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 7 ;
        }
    }
}