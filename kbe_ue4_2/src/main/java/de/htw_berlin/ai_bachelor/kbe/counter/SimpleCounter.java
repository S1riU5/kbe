package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Created by simongyimah on 23/11/15.
 */
public class SimpleCounter implements Counter {

    private static SimpleCounter simpleCounter;
    private int counter = 0;

    private SimpleCounter() {
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static SimpleCounter getInstance() {
        if (simpleCounter == null) {
            simpleCounter = new SimpleCounter();
        }
        return simpleCounter;
    }
}
