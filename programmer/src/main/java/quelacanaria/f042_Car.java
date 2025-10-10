package quelacanaria;
// .toString() method inherited from the object class. Used to return a string
//representation of an object. By default, it returns a hash code as a unique
//identifier. It can be overriden to provide meaningful details.
public class f042_Car {

    String make;
    String model;
    int year;
    String color;

    f042_Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){


        return this.make + " " + this.model + " " + this.year + " " + this.color;
    }


}
