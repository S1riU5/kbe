package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Created by simongyimah on 23/11/15.
 */
public class DoubleCounter implements Counter {

    private static DoubleCounter doubleCounter;
    private int counter = 0;

    private DoubleCounter() {
    }

    public void increment() {
        counter += 2;
    }

    public int getCounter() {
        return counter;
    }

    public static DoubleCounter getInstance() {
        if (doubleCounter == null) {
            doubleCounter = new DoubleCounter();
        }
        return doubleCounter;
    }
}
