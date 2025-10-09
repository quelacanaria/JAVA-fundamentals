package quelacanaria;

public class f025_Main {
        //Object an entity that holds data attributes and can perform actions
        //methods it is a reference data type
    public static void main(String[] args) {

        f026_Car car = new f026_Car();
        f026_Car car1 = new f026_Car();

//        car.isRunning = true;
        //car.model = "toyota";

        System.out.println(car.model);
        //System.out.println(car.isRunning);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.make);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();
    }

}
