package quelacanaria;
//inheritance one class inherits the attributes and methods from another class
public class f039_Main {
    public static void main(String[] args) {

        f038_Dog dog = new f038_Dog();
        f037_Cat cat = new f037_Cat();
        f036_Plant plant = new f036_Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();
        System.out.println("The dog lives: " + dog.lives);
        dog.speak();
        System.out.println("The cat lives: " + cat.lives);
        cat.speak();


        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
