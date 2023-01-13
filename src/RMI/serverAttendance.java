package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class serverAttendance extends UnicastRemoteObject implements attendanceInterface{

    protected serverAttendance() throws RemoteException {
        super();
    }

    @Override
    public Boolean markAttendance(int roll, String name) throws RemoteException {
        System.out.println("Attendance marked for" + roll + "  " +  name);
        return true;

    }
}
