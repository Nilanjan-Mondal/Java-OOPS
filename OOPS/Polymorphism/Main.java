package OOPS.Polymorphism;

// Polymorphism => it is the act of representing same thing in multiple ways
// There are two types of polymorphism -> i) static / compile time ii) dynamic / run time

// Method overloading and constructor overloading falls under the category of static / compile time polymorphism
// Method overriding falls under the category of dynamic / runtime polymorphism

public class Main {
    public static void main(String[] args) {

        // static / compile time polymorphism

        // Method overloading
//        NumberSum num = new NumberSum();
//        num.sum(1,2);
//        num.sum(3.1, 5.1);
//        num.sum(1, 3.9);
//        num.sum(4.5, 7);



        Shapes shape = new Shapes();
        Square square  = new Square();
//        shape.area();


        Circle circle1 = new Circle();
        //circle1.area(); // this calls the area function in Circle class as the obj is of class Circle


        Shapes circle2 = new Circle();
        // we know that type of the reference variable (here Shapes) determines what members can be accessed
        // so why does the area method in the 'Shapes' class not get called ?
        // this is because what method gets called depend on the object created.
        // the area method in the 'Circle' class overrides the area method in 'Shapes' class
        // If there was no area method in the 'Shapes' class then 'circle2.area()' would give error,
        // this is because there is no method named area in Shapes class... and we know that we can only access members present in the type of reference variable (here Shapes)
        // You can check this by commenting out the area method in the 'Shapes' class
        // So basically when we have a area method in 'Shapes' class we should be able to access the member cause the reference type is 'Shapes' but
        // there is area method is 'Circle' class also which overrides the area method in 'Shapes' class, so the area method in circle class is called
        // As a result if method overriding takes place, object type defines which method will run and the reference type defines which method to access.
        // This method is called Upcasting

        circle2.area(); // even if the reference is of type Shapes this calls the area function in the Circle class as the obj is of class Circle


        // How does Java determine all these ??

        // Java determines all these with Dynamic Method Dispatch
        // it is a mechanism by which a call to an overridden method is resolved at run time rather than compile time.
        // when an overriden method is called through a parent class reference variable, java determines which version of the method to called based on the type of object
        // this happens during run time... hence it is called run time / dynamic polymorphism
        // when circle2.area(); is called java knows that we need to use the area method as it is present in the 'Shapes' class (reference type)
        // but which overriden method to use is decided by java during runtime..
        // so during run time java determines the which method to run based on the type of object (here Circle)


        // To understand the flow of static blocks execution, read the following prompt
        // https://chatgpt.com/c/67a72f2f-618c-8003-ab0f-ba9d3f558f14
    }
}
