package quelacanaria;
//Interface = A blueprint for a class that sppecifies a set of abstract methods
//that implementing classes MUST define. Supports multiple inheritance-like
//behavior.
public class f044_Rabbit implements f044_Prey{


    @Override
    public void flee() {
        System.out.println("*The rabbit is running away*");
    }
}
