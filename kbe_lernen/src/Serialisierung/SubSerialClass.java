package Serialisierung;

import java.io.Serializable;

/**
 * Created on 10/02/16.
 */
public class SubSerialClass implements Serializable {

    private int i;
    private double d;

    public SubSerialClass(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void printI() {
        System.out.println(i);
    }

    public void printD() {
        System.out.println(d);
    }
}
