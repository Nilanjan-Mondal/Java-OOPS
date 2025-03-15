package Multithreading;

public class Thread2 implements Runnable{

    // Here we are creating threads by implementing the java.lang.Runnable interface

    @Override
    public void run() {
        for(int i=5; i<10; i++) {
            System.out.println("inside Thread2...");
        }
    }
}
