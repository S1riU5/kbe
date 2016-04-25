import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        SaveObject saveObject = new SaveObject();
//        System.out.println("before Persistence");
//        saveObject.getMySerialClass().getSubSerialClass().printD();
//        saveObject.getMySerialClass().getSubSerialClass().printI();
//        System.out.println("change values");
//        saveObject.getMySerialClass().getSubSerialClass().setD(8.1);
//        saveObject.getMySerialClass().getSubSerialClass().setI(9);
//        saveObject.getMySerialClass().getSubSerialClass().printD();
//        saveObject.getMySerialClass().getSubSerialClass().printI();
//        System.out.println("Persist");
//        saveObject.persistClass();
//        System.out.println("change values again");
//        saveObject.getMySerialClass().getSubSerialClass().setD(1.1);
//        saveObject.getMySerialClass().getSubSerialClass().setI(2);
//        saveObject.getMySerialClass().getSubSerialClass().printD();
//        saveObject.getMySerialClass().getSubSerialClass().printI();
//        System.out.println("load Objects");

        saveObject.loadClass();
        saveObject.getMySerialClass().getSubSerialClass().printD();
        saveObject.getMySerialClass().getSubSerialClass().printI();

      /*  Class clazz = SaveObject.class;
        for (Field publicField : clazz.getFields()) {

            System.out.println(publicField.getName());
            System.out.println(publicField.getType().getName());
            System.out.println(Modifier.toString(publicField.getModifiers()));
        }*/
/*
        try {
            System.out.println(SaveObject.class.getMethod("loadClass").toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/

/*
        Point p = new Point(2,2);
        Class[] argTypes = new Class[] { int.class,int.class };
        try {
            Method method = p.getClass().getMethod("move",argTypes);
            method.invoke(p,1,1);
            System.out.println(p.getX()+" "+ p.getY());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
*/

    }
}
