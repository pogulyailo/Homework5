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

    public void newTire() {
        this.integrity = 1.0;
    }

    public void clearTire(int percent) {
        for (int i = 0; i < 100; i++){
            

        }

        //this.integrity = (integrity < percent / 100f ? integrity : percent / 100f);
    }

    public void show(){
        System.out.println(" bus condition " + integrity);
    }
}

