package quelacanaria;
//Interface = A blueprint for a class that sppecifies a set of abstract methods
//that implementing classes MUST define. Supports multiple inheritance-like
//behavior.
public class f044_Main {
    public static void main(String[] args) {

    f044_Rabbit rabbit = new f044_Rabbit();
    f044_Fish fish = new f044_Fish();
    f044_Hawk hawk = new f044_Hawk();

    hawk.hunt();
    rabbit.flee();
    fish.hunt();
    fish.flee();

    }
}
