package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Created by simongyimah on 23/11/15.
 */
public class CounterFactory {


    public static synchronized Counter getCounterInstance(Typ typ) {
        if (typ == null) {
            throw new NullPointerException();
        }

        switch (typ) {
            case Simple:
                return SimpleCounter.getInstance();
            case Double:
                return DoubleCounter.getInstance();
            case Triple:
                return TripleCounter.getInstance();
            default:
                throw new IllegalArgumentException();

        }
    }
}
