import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 26/11/15.
 */
public class DatumTest {



    @Test(expected = IllegalArgumentException.class)
    public void testDatumInvalidDay(){
        Datum datum = new Datum(100,12,2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDatumInvalidMonth(){
        Datum datum = new Datum(01,50,2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDatumInvalidYear(){
        Datum datum = new Datum(01,12,5000);
    }

    @Test
    public void testDatum(){
        int dayActula = 01;
        int montActual = 01;
        int yearActual = 1989;
        Datum datum = new Datum(dayActula,montActual,yearActual);
        assertEquals(datum.getDay(),dayActula);
        assertEquals(datum.getMonth(),montActual);
        assertEquals(datum.getYear(),yearActual);
    }


}