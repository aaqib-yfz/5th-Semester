package Threads;

public class test {
    public static void main(String[] args) {
        myThread f0 = new myThread();
        myThread f1 = new myThread();
        myThread f2 = new myThread();
        myThread f3 = new myThread();
        System.out.println(f1.getPriority());
        f0.setPriority(1);
        f0.setDaemon(true);// helper thread
        f0.start(); // creates thread and tell it to execute run method
        f1.start(); // creates thread and tell it to execute run method
        f2.start(); // creates thread and tell it to execute run method
        f3.start(); // creates thread and tell it to execute run method
//      f.run();   //-> wont create thread
        for (int i = 0; i<10; i++) {
            System.out.println("main" + " " + Thread.currentThread().getName() + " " + i);
        }
    }
}