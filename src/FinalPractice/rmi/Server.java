package FinalPractice.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject {
    protected Server() throws RemoteException {
    }

    public static void main(String[] args){
        try{
            //create object
            productImp  p1 = new productImp("mangoJuice","bahut tasty painchod");
            productImp p2 = new productImp("slice","bahut ganda panchod");

            //export p1,p2 using unicast object
            product stub1 =  (product) UnicastRemoteObject.exportObject(p1,5555);
            product stub2 = (product) UnicastRemoteObject.exportObject(p2,5555);

            Registry reg = LocateRegistry.getRegistry("localhost",5555);
            reg.bind("l",stub1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
