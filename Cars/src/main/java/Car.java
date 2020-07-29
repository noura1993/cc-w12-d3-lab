public class Car extends Vehicle{

    private Engine engine;

    public Car(double price, String color, Engine engine) {
        super(price, color);
        this.engine = engine;
    }
}
