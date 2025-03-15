package Multithreading;
// line 1571
// line 1135
public class ThreadTester {
    public static void main(String[] args) {

        System.out.println("Starting main thread...");

        Thread t1 = new Thread1(); // Here we are creating threads by extending the java.lang.Thread class...
        t1.start(); // this tells jvm to call the run method (as we have created object of Thread1 so overridden run method will execute)


        Thread t2 = new Thread(new Thread2(), "Thread2"); // Here we are creating threads by implementing the java.lang.Runnable interface
        // we are creating object of the Thread class..... We know Thread class by default implements Runnable
        // go to line 1135 of Thread class and u will find that constructors are defined
        // one of the constructor accepts instance of the Runnable interface (here new Thread2()) and the thread name
        // there are other ways also to call the constructor check line 1135 of Thread class

        // Check 1571 there is a run method which runs when the task != null.... so when we are passing the instance of the Runnable interface
        // the task become != null... and hence the overridden run method gets called (in Thread2)

        // now you may have a question t2 is the instance of Thread so how is the run method of Thread2 getting called..
        // this is written (1575 - 1588 line)... after passing the runnable interface... task = new Thread2()...
        // then it calls op.run() which refers to the run method of the Thread2 class that we implemented..

        t2.start();

        System.out.println("Ending main thread...");
    }
}
