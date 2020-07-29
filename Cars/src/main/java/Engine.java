public class Engine {

    private int fullTank;
    private double size;

    public Engine(int fullTank, double size) {
        this.fullTank = fullTank;
        this.size = size;
    }

    public int getFullTank() {
        return fullTank;
    }

    public double getSize() {
        return size;
    }
}
