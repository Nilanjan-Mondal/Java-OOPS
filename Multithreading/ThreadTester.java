package Multithreading;
// line 1571
// line 1135
public class ThreadTester {
    public static void main(String[] args) {

        System.out.println("Starting main thread...");

        // Thread t1 = new Thread1(); // Here we are creating threads by extending the java.lang.Thread class...
        // t1.start(); // this tells jvm to call the run method (as we have created object of Thread1 so overridden run method will execute)


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

        // so now here the question is which method should be followed ?
        // we know in java multiple inheritance is not possible... so we have a constraint that only single inheritance is possible in extending the Thread class
        // But multiple implementation is possible in java... or we can implement multiple interfaces...
        // Hence, we will follow the Runnable method... also every dev follows that.

        // Another method of implementing the runnable interface is by using the lambda function.
        // we need not implement a new class for this.... we will use lambda function.

        // example :-
        Thread t3 = new Thread( () -> {
            for(int i=10; i<15; i++) {
                System.out.println("Inside " + Thread.currentThread().getName() + "...");
            }
        }, "Thread 3");
        t3.start();



        Stack stack = new Stack(5);

        new Thread( () -> {
            int counter = 0;
            while(++counter <= 5)
                stack.push(100);
        }, "Pusher Thread").start();

        new Thread( () -> {
            int counter = 0;
            while(++counter <= 5)
                System.out.println("Popped: " + stack.pop());
        }, "Popper Thread").start();

        // Here both Pusher and the popper thread are accessing the same Stack and running in parallel
        // So what may happen is by time when the push is sleeping, popper has decreased the stackTop index or vice versa
        // hence this creates a conflict (this is called the race condition) and gives index out of bound exception

        // So to overcome this we need to make each method synchronized.
        // Check Stack class...

        System.out.println("Ending main thread...");
    }
}
