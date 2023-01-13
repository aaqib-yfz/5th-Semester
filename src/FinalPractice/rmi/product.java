package FinalPractice.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface product  extends Remote {
    public String getName() throws RemoteException;
    public String getDesc() throws RemoteException;
}
