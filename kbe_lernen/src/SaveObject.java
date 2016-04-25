import Serialisierung.MySerialClass;

import java.io.*;

/**
 * Created on 10/02/16.
 */
public class SaveObject {

    private MySerialClass mySerialClass = new MySerialClass();
    private FileOutputStream fileOutputStream = null;
    private FileInputStream fileInputStream = null;
    private ObjectOutputStream objectOutputStream = null;
    private ObjectInputStream objectInputStream = null;
    private static final String filename = "serial";
    public static String Test = "Test";

    public void persistClass() {
        try {
            fileOutputStream = new FileOutputStream(filename);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(mySerialClass);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadClass() {
        try {
            fileInputStream = new FileInputStream(filename);
            objectInputStream = new ObjectInputStream(fileInputStream);
            mySerialClass = (MySerialClass) objectInputStream.readObject();
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public MySerialClass getMySerialClass() {
        return mySerialClass;
    }
}
