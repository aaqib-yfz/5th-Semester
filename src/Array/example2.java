package Array;
import Students.Student;
import Students.test;
public class example2 {
    public static void main(String[] args) {
        Student[] array = new Student[10];
        array[0] = new Student(10, "asad");
        array[1] = new Student(20, "majid");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i].getName();
            }
        }
        for(Student s:array){
            if(s != null) {
                s.getName();
            }
        }
        array[2] = new test(30 ,"atif");

    }
}