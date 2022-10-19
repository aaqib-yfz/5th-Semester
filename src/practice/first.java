package practice;
public class first {
     public int number;
     public String name;
     double cgpa;
     first(int number , String name){
         this.number = number;
         this.name = name;
     }
     public int getNumber(){
         return number;
     }
     public void setCgpa(double cgpa){
         this.cgpa = cgpa;
     }
     public double getCgpa(){
         return cgpa;
     }

     public static void main(String[] args){
         first f = new first(10,"salah");
         System.out.println(f.getNumber());
         f.setCgpa(3.14);
         System.out.println(f.getCgpa());
     }
}










