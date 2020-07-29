public class HybirdCar extends Vehicle{

    private Engine engine;
    private ElectricMotor electricMotor;

    public HybirdCar(double price, String color, Engine engine, ElectricMotor electricMotor) {
        super(price, color);
        this.engine = engine;
        this.electricMotor = electricMotor;
    }

    public double getEngineSize() {
        return this.engine.getSize();
    }

    public int getEngineFullTank() {
        return this.engine.getFullTank();
    }

    public double getBattery() {
        return this.electricMotor.getBattery();
    }
}
