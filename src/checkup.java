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


            }
}
