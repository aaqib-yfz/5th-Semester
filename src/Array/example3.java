package Array;
import Students.Student;
import Students.test;

import java.util.LinkedList;
// we put only objects in linked lists
public class example3 {
    public static void main(String[] args) {
        LinkedList<Student> Students =  new LinkedList();
        Students.add(new Student(39,"khan"));
        Students.add(new Student(49,"qazi"));
        Students.add(new Student(59,"huzaifa"));

//        for (Student s: Students){
//            if(s!=null)
//                s.getName();
//        }

        for(int i=0; i<Students.size(); i++){
            Student s = Students.get(i);
            s.getName();

        }
    }
}














