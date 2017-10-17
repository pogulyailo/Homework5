import java.util.Date;

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

    public CarWheel[] getWhellarray() {
        whellarray = new CarWheel[4];
        for ( int i = 0; i < whellarray.length;i++){
            whellarray [i] = new CarWheel();
        }
        return whellarray;
    }

    public CarWheel getCarWheelByIndex (int i){
        CarWheel[] whellarray = getWhellarray();

        return whellarray[i];
    }

    public void setWhellarray(CarWheel[] whellarray) {
        this.whellarray = whellarray;
    }

    public CarDoor[] getDoorarray() {
        doorarray = new CarDoor[5];
        for (int i = 0; i < doorarray.length; i++){
            doorarray[i] = new CarDoor();
        }
        return doorarray;
    }
    public CarDoor getCarDoorByIndex (int i){
        CarDoor[] doorarray = getDoorarray();
        return doorarray[i];
    }

    public void removeAllWheels(){
        CarWheel[] whellarray = getWhellarray();
        for (int i =0; i < whellarray.length; i++){
            whellarray[i] = null;
        }
    }
        public void setDoorarray(CarDoor[] doorarray) {
        this.doorarray = doorarray;
            }

    public void addWheel(int quantity){  // установить на машину Х-новіх колес
        CarWheel[] whellarray = getWhellarray();
        CarWheel [] newWheelarray = new CarWheel[whellarray.length + quantity];
        for (int i = 0; i < newWheelarray.length; i++) {
            newWheelarray [i] = new CarWheel();
        }
        this.whellarray = newWheelarray;
    }
    public int getMaxspeed (){
        if (numberpassengersmoment == 0) {
            currentspeed = 0;
        }else {
            CarWheel[] whellarray = getWhellarray();
          double minintegrity = 1.0;
          for (int i = 0; i < whellarray.length; i++){
              if (whellarray[i].getIntegrity() < minintegrity){
                  minintegrity = whellarray [i].getIntegrity();
              }
          }
         currentspeed = (int) (minintegrity * maxspeed);
        }
          return currentspeed;
    }
}
