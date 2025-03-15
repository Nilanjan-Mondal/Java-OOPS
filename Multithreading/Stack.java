package Multithreading;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        lock = new Object();
        stackTop = -1;
    }

//    public void push(int ele) {
//        if(stackTop == array.length - 1) {
//            System.out.println("Stack is full...");
//            return;
//        }
//        try{
//            Thread.sleep(1000);
//        } catch(Exception e) {}
//        array[stackTop++] = ele;
//        System.out.println(ele + " Pushed");
//    }
//
//    public int pop() {
//        if(stackTop == -1) {
//            System.out.println("Stack is empty...");
//            return -1;
//        }
//        try{
//            Thread.sleep(1000);
//        } catch(Exception e) {}
//        return array[stackTop--];
//    }

    // in the above methods different threads are trying to access the same class methods at a time
    // Hence this creates array index out of bound exception

    // To overcome this we need to make the methods synchronized

    public void push(int ele) {
        synchronized (lock) {
            if(stackTop == array.length - 1) {
                System.out.println("Stack is full...");
                return;
            }
            try{
                Thread.sleep(1000);
            } catch(Exception e) {}
            array[++stackTop] = ele;
            System.out.println(ele + " Pushed");
        }
    }

    public int pop() {
        synchronized (lock) {
            if(stackTop == -1) {
                System.out.println("Stack is empty...");
                return -1;
            }
            try{
                Thread.sleep(1000);
            } catch(Exception e) {}
            return array[stackTop--];
        }
    }

    // Here we are wrapping the main code block inside the synchronized block.
    // It ensures that no other method can be executed by any thread until and unless the current thread finishes the task
    // The synchronized block accepts lock as parameter.
    // In java lock is any instance of a class. (eg -> new String("ok") or new Object(), etc).
    // So I have initialized the lock object in the Stack constructor
    // And i have passed the same lock in both the methods to make it purely synchronized.
    // If i pass diff locks then it be of no sense cuz 2 threads having 2 diff locks can access 2 diff methods (which was the case we were trying to avoid)


    // if we want to skip the lock and synchronized block, then we can make synchronized methods
    // which internally create lock

    // for example ->
//    public synchronized int add(int a, int b) {
//        return a + b;
//    }

    // this internally runs as ->
//    public synchronized int add(int a, int b) {
//        synchronized (this) {
//            return a + b;
//        }
//    }
    // "this" contains the instance of this class which is same and it acts as lock as we know in java any instance of a class can be lock

}
