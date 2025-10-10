package quelacanaria;
//Interface = A blueprint for a class that sppecifies a set of abstract methods
//that implementing classes MUST define. Supports multiple inheritance-like
//behavior.
public class f044_Hawk implements f044_Predator{

    @Override
    public void hunt(){
        System.out.println("*The Hawk is hunting*");
    }

}
