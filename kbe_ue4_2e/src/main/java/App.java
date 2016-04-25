import de.htw_berlin.ai_bachelor.kbe.counter.CounterFactory;
import de.htw_berlin.ai_bachelor.kbe.counter.Typ;

/**
 * Created by simongyimah on 23/11/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(CounterFactory.getCounterInstance(Typ.Simple).getCounter());
        CounterFactory.getCounterInstance(Typ.Simple).increment();
        System.out.println(CounterFactory.getCounterInstance(Typ.Simple).getCounter());
    }
}
