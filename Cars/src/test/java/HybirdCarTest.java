import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HybirdCarTest {
    
    ElectricMotor electricMotor;
    Engine engine;
    HybirdCar hybirdCar;

    @Before
    public void before(){
        electricMotor = new ElectricMotor(1000);
        engine = new Engine(100, 3.5);
        hybirdCar = new HybirdCar(5000, "Red", engine, electricMotor);
    }

    @Test
    public void getPrice() {
        assertEquals(5000, hybirdCar.getPrice(), 0.001);
    }

    @Test
    public void getColor() {
        assertEquals("Red", hybirdCar.getColor());
    }

    @Test
    public void getEngineSize() {
        assertEquals(3.5, hybirdCar.getEngineSize(), 0.001);
    }

    @Test
    public void getEngineFullTank() {
        assertEquals(100, hybirdCar.getEngineFullTank());
    }

    @Test
    public void getBattery() {
        assertEquals(1000, this.hybirdCar.getBattery(),0.001);
    }
}