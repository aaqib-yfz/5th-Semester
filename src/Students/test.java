package Students;

import Students.Student;

public class test extends Student {
    public test(int r, String n) {
        super(r, n);
    }
    public static void main(String[] args) {
        Student s2 = new Student(20,"qazi");
        s2.setCgpa(3.4);
        s2.getCgpa();
        s2.getName();

    }
}