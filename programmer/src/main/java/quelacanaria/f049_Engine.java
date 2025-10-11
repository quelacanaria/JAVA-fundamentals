package quelacanaria;
//Composition represents a "part-of" relationship between objects. For example,
//an engine is "part of" a car . Allows complex objects to be constructed from
//smaller objects.
public class f049_Engine {

    String type;

    f049_Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("Yout start the " + this.type + " engine");
    }

}
