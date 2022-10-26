package Playground;

public class write1  extends Thread{
    private int[] array;
    public write1(int[] array){
        this.array = array;

    }
    public void run(){
        for (int i=0; i< array.length; i++){
            array[i] =1;
        }
    }
}
