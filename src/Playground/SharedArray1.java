package Playground;

public class SharedArray1 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        write7 w7 = new write7(array);
        write1 w1 = new write1(array);
        w1.run();
        w7.run();
        for (int i =0; i< array.length; i++){
            System.out.print(array[i]);
        }
    }

}
