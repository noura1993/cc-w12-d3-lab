import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    ElectricMotor electricMotor;
    ElectricCar electricCar;

    @Before
    public void before(){
        electricMotor = new ElectricMotor(1000);
        electricCar = new ElectricCar(5000, "Red", electricMotor);
    }

    @Test
    public void getPrice() {
        assertEquals(5000, electricCar.getPrice(), 0.001);
    }

    @Test
    public void getColor() {
        assertEquals("Red", electricCar.getColor());
    }

    @Test
    public void getBattery() {
        assertEquals(1000, this.electricCar.getBattery(), 0.001);
    }
}