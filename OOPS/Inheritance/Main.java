package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.l + " " + b1.w + " " + b1.h);

        BoxWeight b2 = new BoxWeight();
        System.out.println(b2.weight + " " + b2.l);

        BoxWeight b3 = new BoxWeight(2, 3, 4, 8);
        System.out.println(b3.l + " " + b3.h + " " + b3.w + " " + b3.weight);



        Box b4 = new BoxWeight(2, 3, 4, 8);
        System.out.println(b4.w); // we can reference a parent to a child (Box b4 is the parent and it is being referenced to child BoxWeight)
        // the below statement gives error while the above one does not
        // this is because it is not actually the type of the object that determines what members can be accessed
        // it is the type of the reference variable i.e(Box) that determines what members can be accessed
        // System.out.println(b4.weight);

        //BoxWeight b5 = new Box(2, 3, 4);
        // we cannot reference a child to a parent
        // there are many variables in the child and parent class
        // you care given access to variables that are in the reference type i.e. BoxWeight
        // hence you should have access to weight variable
        // this also means that the ones u r trying to access should also be initialised
        // but here when the object itself is of type parent class, how will you call the constructor of the child class
        // hence this gives error
        //System.out.println(b5);

        BoxPrice b6 = new BoxPrice(2, 3, 4, 8, 100);
        System.out.println(b6.cost);
        System.out.println(b6.weight);


    }
}
