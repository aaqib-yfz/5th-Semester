package practice;
import Students.Student;
public class array_p {
    public static void main(String[] args){
    Student[] arr = new Student[10];
    arr[0] = new Student(10,"anfal");
    arr[1] = new Student(20,"aoza");
    arr[2] = new Student(30,"aaaqib");
    for(int i = 0; i<arr.length; i++){
        if( arr[i] != null) {
            arr[i].getName();

        }
    }
}
}
