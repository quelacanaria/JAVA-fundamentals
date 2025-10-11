package quelacanaria;
//Composition represents a "part-of" relationship between objects. For example,
//an engine is "part of" a car . Allows complex objects to be constructed from
//smaller objects.
public class f049_Car {

    String model;
    int year;
    f049_Engine engine;

    f049_Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new f049_Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }

}
