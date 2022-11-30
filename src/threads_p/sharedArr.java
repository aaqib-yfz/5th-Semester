package threads_p;

public class sharedArr {
    public static void main(String[] args){
        int[] array = new int[10000];
        write7 t7 = new write7(array);
        write1 t1 = new write1(array);

        t1.start();
        t7.start();
        try{
            t1.join();
            t7.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            synchronized (array) {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
            }
        }

    }
}
