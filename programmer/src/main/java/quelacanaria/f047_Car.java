package quelacanaria;

public class f047_Car {

    //Final Once a value is assigned to this variable, it cannot be changed (reassigned).
    private final String model;
    private String color;
    private int price;

    f047_Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("price can't be less than zero");
        }else{
            this.price = price;
        }
    }
}
