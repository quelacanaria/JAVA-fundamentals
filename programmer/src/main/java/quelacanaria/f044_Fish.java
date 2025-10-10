package quelacanaria;
//Interface = A blueprint for a class that sppecifies a set of abstract methods
//that implementing classes MUST define. Supports multiple inheritance-like
//behavior.
public class f044_Fish implements f044_Prey, f044_Predator{

    @Override
    public void flee(){
        System.out.println("*The Small Fish is swimming away*");
    }

    @Override
    public void hunt(){
        System.out.println("*The Big Fish is hunting*");
    }
}
