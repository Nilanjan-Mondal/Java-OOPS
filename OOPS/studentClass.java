package OOPS;

public class studentClass {

    // public static class Student {  // Student is the class name
    //     String name;
    //     int rollNum;
    //     double percent;
    // }

    // we can also create the class as a separate file in the same package (Student.java) 

    public static void change(Student temp) {
        temp.name = "Cheemdi";
    }

    public static void main(String[] args) {
        Student A = new Student();  // A is the object name
        A.name = "Cheemdu";
//        A.rollNum = 23;
        A.percent = 90;
        System.out.println(A.name);
        change(A);
        System.out.println(A.name);  // classes are passes by reference

        Student B = new Student(20, 69);
        System.out.println(B.age);
        System.out.println(B.iq);
        System.out.println("Without using static keyword: " + B.numberOfStudent);
        System.out.println("Using static keyword: " + B.numOfStud);

        Student C = new Student(20, 40);
        System.out.println("Without using static keyword: " + C.numberOfStudent);
        System.out.println("Using static keyword: " + C.numOfStud);

        Student D = new Student(60, 80);
        System.out.println("Without using static keyword: " + D.numberOfStudent);
        System.out.println("Using static keyword: " + D.numOfStud);

        Student E = new Student(60, 80);
        System.out.println("Without using static keyword: " + E.numberOfStudent);
        System.out.println("Using static keyword: " + E.numOfStud);
    }
}
