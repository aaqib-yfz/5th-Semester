package RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class clientAttendance {
    public static void main(String[] args) throws Exception {
        //registry access
        Registry reg = LocateRegistry.getRegistry("localhost",5555);
        // finding
         attendanceInterface a =  (attendanceInterface) reg.lookup("attendance");
         a.markAttendance(23,"aaqib");
    }
}
