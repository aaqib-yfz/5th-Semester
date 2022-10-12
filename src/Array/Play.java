package Array;
import Students.Student;

import java.util.LinkedList;

public class Play {

   public static void main(String[] args){
       LinkedList<Student> abc = new LinkedList();
       abc.add(new Student(20,"khan"));
       abc.add(new Student(10,"aaqib"));
       for (int i =0; i<abc.size(); i++){
           Student s = abc.get(i) ;
           s.getName();

       }
   }

}
