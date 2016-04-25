package Serialisierung;

import java.io.Serializable;

/**
 * Created on 10/02/16.
 */
public class MySerialClass implements Serializable {

    private SubSerialClass subSerialClass = new SubSerialClass(5,5.31);


    private int test;

    public SubSerialClass getSubSerialClass() {
        return subSerialClass;
    }

    public void setSubSerialClass(SubSerialClass subSerialClass) {
        this.subSerialClass = subSerialClass;
    }
}
