package Bank_example;
public class Contract_emp   implements Payable {
    public Contract_emp(int dailyWage,int noOfDays) {
//        super(cnic, address, name);
        this.dailyWage = dailyWage;
        this.noOfDays = noOfDays;
    }
    public int dailyWage;
    public int noOfDays;

    public Contract_emp() {
   }

    public int getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(int dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }
    public int getPayableAmount(){
        return dailyWage * noOfDays;
    }

    public static void main(String[] args){
        Contract_emp e = new Contract_emp(120,30);
        System.out.print(e.getPayableAmount());
    }
}








