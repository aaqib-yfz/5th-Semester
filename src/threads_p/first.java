package threads_p;

public class first  extends Thread {
    public void run() {
                System.out.print("Thread Started");
    }
    public static void main(String[] args){
        first f = new first();
        f.run();
        f.start();
    }

}

