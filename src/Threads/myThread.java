package Threads;

public class myThread extends Thread {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("My thread" + " " + Thread.currentThread().getName() + " " + i);
    }
  }
}