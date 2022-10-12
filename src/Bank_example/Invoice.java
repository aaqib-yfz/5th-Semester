package Bank_example;
public class Invoice  extends Contract_emp implements  Payable {

    private int unitPrice;
    private int quantity;
    public Invoice(int unitPrice,int quantity){
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getPayableAmount(){
        return quantity*unitPrice;
    }

    public static void main(String[] args){
        Contract_emp e = new Contract_emp(120,30);
        System.out.print(e.getPayableAmount());
    }
}
 /*
->static method ko object ky sath ni rakha jata
->when method is final it cant be over-riden
->when class is kept final , it wont be used in inheritance
*/




