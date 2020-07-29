import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricMotorTest {

    ElectricMotor electricMotor;

    @Test
    public void getBattery() {
        electricMotor = new ElectricMotor(1000);
        assertEquals(1000, electricMotor.getBattery(), 0.001);
    }
}