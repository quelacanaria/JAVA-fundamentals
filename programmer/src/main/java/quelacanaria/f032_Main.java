package quelacanaria;

public class f032_Main {
    public static void main(String[] args) {
        //Array of Objects
        f031_Car car1 = new f031_Car("Honda Civic", "Red");
        f031_Car car2 = new f031_Car("Toyota Innova", "Blue");
        f031_Car car3 = new f031_Car("Wigo", "Green");

        System.out.println(car1.model);
        System.out.println(car1.color);

        System.out.println(car2.model);
        System.out.println(car2.color);

        System.out.println(car3.model);
        System.out.println(car3.color);

//        f031_Car[] cars = {car1, car2, car3};
//
//        for(f031_Car car : cars){
//
//            car.drive();
//
//        }

        f031_Car[] cars = {new f031_Car("Chevrolet", "White"),
                           new f031_Car("Ferrari", "Black"),
                           new f031_Car("Vios", "White")};

        for(f031_Car car : cars){

            car.color = "Red";

        }
        for(f031_Car car : cars){

            car.drive();

        }

    }
}
