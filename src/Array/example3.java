package Array;
import Students.Student;
import Students.test;

import java.util.LinkedList;
// we put only objects in linked lists
public class example3 {
    public static void main(String[] args) {
        LinkedList<Student> obj = new LinkedList<Student>();
        obj.add(new Student(39, "khan nashai your neighbour"));
        obj.add(new Student(49, "qazi"));
        obj.add(new Student(59, "huzaifa"));

//        for (Student s: obj){
//            if(s!=null)
//                s.getName();
//        }

        for (int i = 0; i < obj.size(); i++) {
            Student s = obj.get(i);
            s.getRoll();
            s.getName();
        }
    }

}














