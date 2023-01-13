package FinalPractice.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException{
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",5555);
            product juice = (product) reg.lookup("l");
            juice.getName();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
