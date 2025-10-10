package quelacanaria;
//Method Overriding When a subclass provides its own implementation of a method that is already defined.
//allows for code reusability and give specific implementations
public class f041_Main {
    public static void main(String[] args) {
        f041_Cat cat1 = new f041_Cat();
        f041_Dog dog1 = new f041_Dog();
        f041_Fish fish1 = new f041_Fish();

        cat1.move();
        dog1.move();
        fish1.move();

    }


}
