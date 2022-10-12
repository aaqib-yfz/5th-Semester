package Students;

public class Practice {
    public int roll;
  public String name;

    Practice(int roll,String name){
        this.roll = roll;
        this.name = name;

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
            Practice salah = new Practice(23,"salah");
            System.out.print(salah.getName());

    }
}






