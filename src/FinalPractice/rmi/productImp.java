package FinalPractice.rmi;

import java.rmi.RemoteException;

public class productImp implements product {
    public String name;
    public String desc;

    public productImp(String name,String desc) throws RemoteException{
        this.name = name;
        this.desc = desc;
    }
    public String getName() throws RemoteException {
      return this.name;
    }

    public String getDesc() throws RemoteException{
        return this.desc;
    }

}
