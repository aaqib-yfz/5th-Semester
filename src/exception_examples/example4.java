package exception_examples;
import Students.Student;
public class example4 {
    public static void main(String[] args) {
        Student s = new Student(23, "atif");
        try {
            s.setCgpa(3.33);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}