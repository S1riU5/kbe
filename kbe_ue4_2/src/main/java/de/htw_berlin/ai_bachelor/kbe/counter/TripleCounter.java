package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Created by simongyimah on 23/11/15.
 */
public class TripleCounter implements Counter {

    private static TripleCounter tripleCounter;
    private int counter;

    private TripleCounter() {
    }

    public void increment() {
        counter += 3;
    }

    public int getCounter() {
        return counter;
    }

    public static TripleCounter getInstance() {
        if (tripleCounter == null) {
            tripleCounter = new TripleCounter();
        }

        return tripleCounter;
    }
}
