public class CarWheel {
    private double integrity;

    public CarWheel() {
        this(1.0);
    }

    public CarWheel(double integrity) {
        this.integrity = integrity;
    }

    public double getIntegrity() {
        return integrity;
    }

    public void setIntegrity(double integrity) {
        this.integrity = integrity;
    }

    public double newTire() {
        this.integrity = 1.0;
        return integrity;
    }

    public int clearTire(int percent) {
        this.integrity = (integrity < percent / 100 ? integrity : percent / 100);
        return percent;
    }
}

