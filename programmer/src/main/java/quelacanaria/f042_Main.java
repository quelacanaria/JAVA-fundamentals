package quelacanaria;
// .toString() method inherited from the object class. Used to return a string
//representation of an object. By default, it returns a hash code as a unique
//identifier. It can be overriden to provide meaningful details.

public class f042_Main {
    public static void main(String[] args) {

        f042_Car car1 = new f042_Car("Toyota", "Innova", 2025, "Blue");
        f042_Car car2 = new f042_Car("Honda", "Civic", 2025, "Red");


        System.out.println(car1);

        System.out.println(car1.make + " " + car1.model + " " + car1.year + " " + car1.color);

        System.out.println(car2);
    }

}
