package practice;

public class Student_g extends Student_p {
    public Student_g(int r,String n){

        super(r,n);
    }
public static void main(String[] args){
            Student_g s1 = new Student_g(10,"aslam");
            s1.setCgpa(2.4f);
            s1.getStatus();
            Student_p s2 = new Student_g(20,"khan");

}
}
