import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Vehicle car;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(100, 3.5);
        car = new Car(5000, "Red", engine);
    }

    @Test
    public void getPrice() {
        assertEquals(5000, car.getPrice(), 0.001);
    }

    @Test
    public void getColor() {
        assertEquals("Red", car.getColor());
    }

    @Test
    public void getEngineSize() {
        assertEquals(3.5, ((Car) car).getEngineSize(), 0.001);
    }

    @Test
    public void getEngineFullTank() {
        assertEquals(100, ((Car) car).getEngineFullTank(), 0.001);
    }
}