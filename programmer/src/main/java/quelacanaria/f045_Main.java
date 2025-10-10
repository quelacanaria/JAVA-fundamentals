package quelacanaria;
//Polymorphism = "POLY" = "MANY"
//              "MORPH" = "SHAPE"
//              Object can identify as other objects
//              Object can be treated as objects of a common superclass
public class f045_Main {
    public static void main(String[] args) {

        f045_Car car = new f045_Car();
        f045_Bike bike = new f045_Bike();
        f045_Boat boat = new f045_Boat();

        car.go();
        bike.go();
        boat.go();

        f045_Vehicle[] vehicles = {car, bike, boat};

        for(f045_Vehicle vehicle : vehicles){
            vehicle.go();
        }


    }
}
