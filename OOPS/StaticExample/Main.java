package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        fun();
    }
    static void fun() {
        // greeting(); you cannot use this because this requires an instance
        // but the function you are using it in does not depend on instance

        // we cannot use non-static stuff without referencing their instances in a static context

        // hence i am referencing it.
        Main obj = new Main();
        obj.greeting();
    }
    void greeting() {
        System.out.println("This is Greeting...");
    }
}
