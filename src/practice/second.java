package practice;

import java.awt.*;

public class second extends first {
     public String course;
    second(int number, String name,String course) {
        super(number, name);
        this.course = course;
    }
    public String getCourse(){
        return course;

    }
    public static void main(String[] args){
        second s = new second(10,"aaqib","cs");
        System.out.println(s.getNumber());
        s.setCgpa(2.1);
        System.out.println(s.getCgpa());
        System.out.print(s.getCourse());

    }
}





