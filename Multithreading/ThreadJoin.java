package Multithreading;

public class ThreadJoin {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");

        Thread t1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName());
        }, "Our Thread");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // whenever we call thread.join, it blocks the main method to execute parallely
        // The current run method executed first then the main thread will run
        // hence after "main is starting" t1 thread runs then "main is ending"
        // without t1.join "main is starting", "main is ending" and then t1 thread will run

        System.out.println("Main thread ending...");

    }
}
