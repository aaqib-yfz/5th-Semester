package practice;

public class exception_p {
    public static void main(String[] args){
        try{
            int myint = Integer.parseInt("cute");
        }
        catch (NumberFormatException a){
            System.out.print("no int");
        }
    }
}
