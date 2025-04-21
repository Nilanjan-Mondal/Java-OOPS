package OOPS.Inheritance;

// single inheritance
public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // if we dont write super() manually then super() is called by default and the Box() constructor gets called
        // so we r getting -1 for l h w even if we r passing the values from the main

        // to overcome this situation we need to manually write super and pass the arguments as the
        // constructors present in the parent class
        super(l, h, w); // this will call the Box(l, h, w) constructor and set the values
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        // suppose we do not have the default constructor (try commenting out the Box() constructor in the Box class) in the box class explicitly then super() does not gets called
        // hence we get error (no parameterless constructor present in box class)
        // now u can think that java provides default constructor but why is it not n this case...
        // this is because Java only provides a default (no-argument) constructor if you don’t declare any constructor in your class... But we already have params constructor in the Box class.
        this.weight = weight;
    }
}
