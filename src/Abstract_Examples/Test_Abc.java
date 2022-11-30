package Abstract_Examples;

public  class Test_Abc extends Abc {
    public Test_Abc(int num) {
        super(num);
    }

    @Override
    public void m1() {
      System.out.print(2);
    }

    public static void main(String[] args){
        Abc a = new Test_Abc(9);
        System.out.print(a.getnum());
    }
}
