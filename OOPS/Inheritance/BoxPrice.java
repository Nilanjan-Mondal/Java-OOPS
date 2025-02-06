package OOPS.Inheritance;

// Multi level inheritance
public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        this.cost = -1;
    }

    BoxPrice (double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
