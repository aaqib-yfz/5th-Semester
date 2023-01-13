package FinalPractice.Serialization;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        random obj1 = new random();
            obj1.i = 5;

            File f = new File("serial.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        oos.flush();

        // de serialization
        Object result = null;
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois =  new ObjectInputStream(fis);
         result = ois.readObject();
         System.out.println(result);

    }
    public static class random implements Serializable {
        int i ;
    }
}
