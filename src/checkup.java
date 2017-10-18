import java.time.Instant;
import java.util.Date;

public class checkup {
            public static void main(String[] args){

                CarDoor carDoor = new CarDoor();

                System.out.println(carDoor);
                System.out.println(carDoor.changeDoorcondition());
                System.out.println(carDoor.changeWindowstate());
                System.out.println(carDoor.closeDoorcondition());
                System.out.println(carDoor.openDoorcondition());

                CarWheel carWheel = new CarWheel();
                int integrity;
                int percen = 17;
                System.out.println(carWheel);
                System.out.println(carWheel.newTire());
                System.out.println(carWheel.clearTire(17));


                String date = "";
                Car car = new Car("volvo", 180, 7, 4, 2, 100);
                System.out.println(car.getCurrentspeed());
                System.out.println(car.putPassenger());
                System.out.println(car.disEmbarkpassenger());
                System.out.println(car.disEmbarkallpassengers());
                System.out.println(car.getCarWheelByIndex(3));
                System.out.println(car.getCarDoorByIndex(2));
                System.out.println(car.removeAllWheels());
                car.addWheels(3);
                System.out.println(car.getWhellarray().length);
                System.out.println(car.getMaxspeed());

            }
}
