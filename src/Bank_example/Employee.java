package Bank_example;

public abstract class Employee {
    public int cnic;
    public String address ;
    public String name;
    public Employee(){

    }
    public Employee(int cnic,String address,String name){
        this.cnic = cnic;
        this.address = address;
        this.name = name;

    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnic() {
        return cnic;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}






