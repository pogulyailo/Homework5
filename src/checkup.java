public class checkup {
            public static void main(String[] args){


                CarDoor nodata = new CarDoor();
                CarDoor carDoor = new CarDoor("open", "closed");
                CarDoor.doorcondition();
                CarDoor.windowstate();
                CarDoor.changeDoorcondition();
                CarDoor.changeWindowstate();

                //System.out.println(CarDoor);
                //System.out.println(.doorcondition);
                //System.out.println(.changeDoorcondition);
            }
}
