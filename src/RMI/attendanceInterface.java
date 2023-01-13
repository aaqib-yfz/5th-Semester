package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface attendanceInterface extends Remote {
    public Boolean markAttendance(int roll, String name) throws RemoteException;
}
