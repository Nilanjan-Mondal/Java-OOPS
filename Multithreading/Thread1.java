package Multithreading;

public class Thread1 extends Thread {

    // Here we are creating threads by extending the java.lang.Thread class...

    @Override
    public void run() {
        for(int i=1; i<5; i++) {
            System.out.println("inside Thread1...");
        }
    }

}
