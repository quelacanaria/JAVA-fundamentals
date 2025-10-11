package quelacanaria;
//Composition represents a "part-of" relationship between objects. For example,
//an engine is "part of" a car . Allows complex objects to be constructed from
//smaller objects.
public class f049_Main_Composition {
    public static void main(String[] args) {

        f049_Car car = new f049_Car("Toyota", 2023, "V8");

        System.out.println(car.model + " " + car.model + " " + car.engine.type);

        car.start();
    }
}
