package OOPS;

public class Student {

    public String name;
    private int rollNum;
    double percent;
    int age;
    int iq;

    int numberOfStudent;
    //numberOfStudent is a separate variable for each object and
    // always starts at 0 (or its default value) when a new object is created.

    static int numOfStud; // static
    // The static variable numOfStud is a single shared variable for the entire class,
    // so its value does not reset when a new object is created.
    // Instead, it increments each time the constructor runs


    public Student() { } // default constructor

    public Student(int age, int iq) { // constructor
        this.age = age;
        this.iq = iq;
        numberOfStudent++;
        numOfStud++;
    }

    public int getRollNum() { // getter
        return rollNum;
    }
    public void setRollNum(int val) { // setter
        rollNum = val;
    }
}

