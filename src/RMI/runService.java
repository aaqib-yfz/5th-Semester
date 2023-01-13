package RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class runService {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        serverAttendance s = new serverAttendance();
        //starting registry and then publishing object on it
        Registry reg = LocateRegistry.createRegistry(5555);
        reg.bind("attendance",s);

    }
}
