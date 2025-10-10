package quelacanaria;

public class f031_Car {
    //Array of Objects
    String model;
    String color;

    f031_Car(String model, String color){

        this.model = model;
        this.color = color;

    }

    void drive(){

        System.out.println("You drive the " + this.model + " " + this.color);

    }

}
