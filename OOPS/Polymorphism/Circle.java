package OOPS.Polymorphism;

public class Circle extends Shapes {

    static {
        System.out.println("I am in static block of child class Circle...");
    }


    // this will run when obj of circle is created
    // hence it is overriding the parent method

    @Override // this is annotation (use to verify if our function is actually overridden or not )
    void area() {
        System.out.println("I am in circle's area...");
    }
}
