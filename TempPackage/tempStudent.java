package TempPackage;

import OOPS.Student;

public class tempStudent {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.name = "HagguCheemdu";
        s2.setRollNum(23);
        System.out.println(s2.name);
        System.out.println(s2.getRollNum());
    }
}
