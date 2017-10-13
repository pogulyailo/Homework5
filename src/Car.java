/*import java.util.Date;

public class Car {
    private Date datemanufacture;
    private String enginestype;

    private int maxspeed;
    private int accelerationtime;

    private int serviceability;
    private int numberpassengersmoment;

    private int currentspeed;

    private CarWheel[] whellarray;
    private CarDoor[] doorarray;

    public Car(String enginestype, int maxspeed, int accelerationtime, int serviceability, int numberpassengersmoment, int currentspeed) {
        this.maxspeed = maxspeed;
        this.enginestype = enginestype;
        this.accelerationtime = accelerationtime;
        this.serviceability = serviceability;
        this.numberpassengersmoment = numberpassengersmoment;
        this.currentspeed = currentspeed;
    }

    public Car(Date datemanufacture) {
        this.datemanufacture = datemanufacture;
    }

    public int getMaxSpeed() {
        return maxspeed;
    }

    public void setMaxSpeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getAccelerationtime() {
        return accelerationtime;
    }

    public void setAccelerationtime(int maxspeed) {
        this.accelerationtime = accelerationtime;
    }

    public int getServiceability() {
        return serviceability;
    }

    public void setServiceability(int maxspeed) {
        this.serviceability = serviceability;
    }

    public int getNumberpassengersmoment() {
        return numberpassengersmoment;
    }

    public void setNumberpassengersmoment(int maxspeed) {
        this.numberpassengersmoment = numberpassengersmoment;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int maxspeed) {
        this.currentspeed = currentspeed;
    }

    public void ChangeSpeed(int change) {
        if (0 <= currentspeed && currentspeed < maxspeed) {
            this.currentspeed = change;
        } else {
            System.out.println("Value is out of range!");
        }
    }
    public void Putpassenger (){
        if (numberpassengersmoment < serviceability) this.numberpassengersmoment++;
            }
    public void Disembarkpassenger (){
        if (numberpassengersmoment > 0) this.numberpassengersmoment--;
    }
    public void Disembarkallpassengers (){
           this.numberpassengersmoment = 0;
    }
    public int getDoorarray(int i) { // получить дверь по индексу
        return this.doorarray.length;
    }
    public int getWheelarray(int i){ //получить колесо по индексу
        return this.whellarray.length;
    }

    public void Removeallwheels (){ // снять все колеса
        for (CarDoor : doorarray = CarWheel[0]) {

        }

    }
    public void AddWheel(int quantity){  // установить на машину Х-новіх колес
        for (int i = 0; i < quantity; i++) {

        }
    }
}
*/