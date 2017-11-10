import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Car {
    private Date datemanufacture;
    private String enginestype;

    private int maxspeed;
    private int accelerationtime;

    private int serviceability;
    private int numberpassengersmoment;

    private int currentspeed;

    private CarWheel[] whellarray = new CarWheel[0];
    private CarDoor[] doorarray;


    public Car(String enginestype, int maxspeed, int accelerationtime, int serviceability, int numberpassengersmoment, int currentspeed) {
        this.enginestype = enginestype;
        this.maxspeed = maxspeed;
        this.enginestype = enginestype;
        this.accelerationtime = accelerationtime;
        this.serviceability = serviceability;
        this.numberpassengersmoment = numberpassengersmoment;
        this.currentspeed = currentspeed;
    }

    Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();

    {
        this.datemanufacture = datemanufacture;
    }

    public String getEnginestype() {
        return enginestype;
    }

    public void setEnginestype(String enginestype) {
        this.enginestype = enginestype;
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

    public void changeSpeed(int change) {
        if (0 <= currentspeed && currentspeed < maxspeed) {
            this.currentspeed = change;
            System.out.println("Current speed changed -" + change);
        } else {
            System.out.println("Value is out of range!");
            return;
        }
    }

    public String putPassenger() {
        if (numberpassengersmoment < serviceability) this.numberpassengersmoment++;
        {
            this.numberpassengersmoment = numberpassengersmoment;
            return "one other passenger was added";
        }
    }

    public String disEmbarkpassenger() {
        if (numberpassengersmoment > 0) this.numberpassengersmoment--;
        {
            this.numberpassengersmoment = numberpassengersmoment;
            return "one passenger is landed";
        }
    }

    public String disEmbarkallpassengers() {
        this.numberpassengersmoment = 0;
        return " number of passengers - " + 0;
    }

    public CarWheel[] getWhellarray() {
        return whellarray;
    }

    public CarWheel getCarWheelByIndex(int i) {
        CarWheel[] whellarray = getWhellarray();
        System.out.println("wheel by index -" + whellarray[i]);
        return whellarray[i];
    }

    public void setWhellarray(CarWheel[] whellarray) {
        this.whellarray = whellarray;
    }

    public CarDoor[] getDoorarray() {
        doorarray = new CarDoor[5];
        for (int i = 0; i < doorarray.length; i++) {
            doorarray[i] = new CarDoor();
        }
        return doorarray;
    }

    public CarDoor getCarDoorByIndex(int i) {
        CarDoor[] doorarray = getDoorarray();
        System.out.println("door by index -" + doorarray[i]);
        return doorarray[i];
    }

    public String removeAllWheels() {
        CarWheel[] whellarray = getWhellarray();
        for (int i = 0; i < whellarray.length; i++) {
            whellarray[i] = null;
        }
        return "number of wheels by car - " + 0;
    }

    public void setDoorarray(CarDoor[] doorarray) {
        this.doorarray = doorarray;
    }

    public void addWheels(int quantity) {
        CarWheel[] newWheelarray = new CarWheel[whellarray.length + quantity];
        for (int i = 0; i < whellarray.length; i++) {
            newWheelarray[i] = whellarray[i];
        }
        for (int i = whellarray.length; i < newWheelarray.length; i++) {
            newWheelarray[i] = new CarWheel();
        }
        this.whellarray = newWheelarray;
        System.out.println("installed on the machine X wheels -" + quantity);
    }

    public int getMaxspeed() {
        if (numberpassengersmoment == 0) {
            currentspeed = 0;
        } else {
            CarWheel[] whellarray = getWhellarray();
            double minintegrity = 1.0;
            for (int i = 0; i < whellarray.length; i++) {
                if (whellarray[i].getIntegrity() < minintegrity) {
                    minintegrity = whellarray[i].getIntegrity();
                }
            }
            currentspeed = (int) (minintegrity * maxspeed);
        }
        System.out.println("current max speed -" + maxspeed);
        return currentspeed;

    }
    public void show(){
        System.out.println("door by index -" + doorarray);
        System.out.println("wheel by index -" + whellarray);
    }
}