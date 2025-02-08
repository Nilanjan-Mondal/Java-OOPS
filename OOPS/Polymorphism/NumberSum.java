package OOPS.Polymorphism;

public class NumberSum {

    // Method overloading (sum) => method name should be same, parameters order should be diff and return type can be diff

    void sum (int a, int b) {
        System.out.println("int int");
        System.out.println(a+b);
    }

    void sum (double a, double b) {
        System.out.println("double double");
        System.out.println(a+b);
    }

    void sum (int a, double b) {
        System.out.println("int double");
        System.out.println(a+b);
    }

    void sum (double a, int b) {
        System.out.println("double int");
        System.out.println(a+b);
    }
}
