package Abstract_Examples;

public  abstract class Abc {
    private int num;
    public Abc(int num){
        this.num = num ;
    }
    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num= num;

    }

    public abstract void m1();
    public static void main(String[] args){

    }
}
