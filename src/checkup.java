import java.time.Instant;
import java.util.Date;

public class checkup {
            public static void main(String[] args){

                CarDoor carDoor = new CarDoor();

                carDoor.show();
                carDoor.changeDoorcondition();
                carDoor.changeWindowstate();
                carDoor.show();
                carDoor.closeDoorcondition();
                carDoor.openDoorcondition();

                CarWheel carWheel = new CarWheel();
                int integrity;
                int percen = 17;
                carWheel.show();
                carWheel.newTire();
                carWheel.clearTire(17);
                carWheel.show();


                String date = "";
                Car car = new Car("volvo", 180, 7, 2, 4, 90);
                car.changeSpeed(90);
                System.out.println(car.putPassenger());
                System.out.println(car.disEmbarkpassenger());
                System.out.println(car.disEmbarkallpassengers());
                car.getCarDoorByIndex(3).show();
                car.getCarWheelByIndex(4).show();
                System.out.println(car.removeAllWheels());
                System.out.println(car.getWhellarray().length);
                car.addWheels(2);
                car.addWheels(5);
                System.out.println(car.getWhellarray().length);
                System.out.println(car.getMaxspeed());

            }
}
