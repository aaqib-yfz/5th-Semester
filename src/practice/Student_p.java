package practice;

import Students.Student;

public class Student_p {
    int roll;
    String name;
    float cgpa;
    public Student_p(int roll , String name){
        this.roll = roll;
        this.name = name;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName( String name){
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getName(){
        return name;
    }
    public void getStatus(){
        if (this.cgpa > 2.5 && cgpa <4.0) {
            System.out.println("good");
        }
        else {
            System.out.println("Bakwasi");
        }

    }

    public static void main(String[] args){
          Student_p s =  new Student_p(10,"huzaifa");
          s.setCgpa(3.5f);
          System.out.println(s.getCgpa());
    }

}




