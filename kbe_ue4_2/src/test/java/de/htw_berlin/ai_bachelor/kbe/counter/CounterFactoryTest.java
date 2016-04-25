package de.htw_berlin.ai_bachelor.kbe.counter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by simongyimah on 23/11/15.
 */
public class CounterFactoryTest {

    @Test
    public void testGetCounterInstanceSimple() throws Exception {
        assertTrue(CounterFactory.getCounterInstance(Typ.Simple) instanceof SimpleCounter);
    }

    @Test
    public void testGetCounterInstanceDouble() throws Exception {
        assertTrue(CounterFactory.getCounterInstance(Typ.Double) instanceof DoubleCounter);
    }

    @Test
    public void testGetCounterInstanceTriple() throws Exception{
        assertTrue(CounterFactory.getCounterInstance(Typ.Triple) instanceof TripleCounter);
    }

    @Test(expected = NullPointerException.class)
    public void testGetCounterInstanceNull() throws Exception{
        CounterFactory.getCounterInstance(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCounterInstanceInvalid() throws Exception{
        CounterFactory.getCounterInstance(Typ.Quadruple);
    }

    @Test
    public void testGetCounterInstnceSingletonSimple(){
        assertEquals(CounterFactory.getCounterInstance(Typ.Simple),CounterFactory.getCounterInstance(Typ.Simple));

    }

    @Test
    public void testGetCounterInstanceSingletonDouble(){
        assertEquals(CounterFactory.getCounterInstance(Typ.Double),CounterFactory.getCounterInstance(Typ.Double));
    }

    @Test
    public void testGetCounterInstanceSingletonTriple(){
        assertEquals(CounterFactory.getCounterInstance(Typ.Triple),CounterFactory.getCounterInstance(Typ.Triple));

    }
}