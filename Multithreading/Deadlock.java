package Multithreading;

public class Deadlock {
    Object lock1;
    Object lock2;

    public Deadlock() {
        lock1 = new Object();
        lock2 = new Object();
    }

    public void dLock() {
        new Thread( () -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Lock acquired...");
                }
            }
        }, "Thread 1").start();


        new Thread( () -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Lock acquired...");
                }
            }
        }, "Thread 2").start();
    }

    public static void main(String[] args) {

        System.out.println("Main thread starting...");

        Deadlock d1 = new Deadlock();
        d1.dLock();

        System.out.println("Main thread ending...");
    }
}
