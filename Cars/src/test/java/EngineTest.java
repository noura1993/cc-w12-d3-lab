import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
         engine = new Engine(100,3.5);
    }

    @Test
    public void getFullTank() {
        assertEquals(100, engine.getFullTank());
    }

    @Test
    public void getSize() {
        assertEquals(3.5, engine.getSize(), 0.001);
    }
}