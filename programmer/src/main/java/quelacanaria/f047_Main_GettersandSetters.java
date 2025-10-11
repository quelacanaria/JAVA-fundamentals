package quelacanaria;

public class f047_Main_GettersandSetters {
    public static void main(String[] args) {

        f047_Car car1 = new f047_Car("Chevrolet", "Blue", 100000);

        car1.setColor("Red");
        car1.setPrice(150000);
        System.out.println(car1.getColor() + " " + car1.getModel() + " " + car1.getPrice());

    }
}
