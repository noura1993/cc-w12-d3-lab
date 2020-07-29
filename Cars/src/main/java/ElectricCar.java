public class ElectricCar extends Vehicle{

    ElectricMotor electricMotor;


    public ElectricCar(double price, String color, ElectricMotor electricMotor) {
        super(price, color);
        this.electricMotor = electricMotor;
    }

    public double getBattery() {
        return this.electricMotor.getBattery();
    }
}
