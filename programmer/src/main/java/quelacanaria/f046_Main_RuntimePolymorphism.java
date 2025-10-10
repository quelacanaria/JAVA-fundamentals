package quelacanaria;

import java.util.Scanner;

//Runtime polymorphism = When the method that gets executed is decided at runtime
//based on the actual type of the object.
public class f046_Main_RuntimePolymorphism {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        f046_Animal animals;

        System.out.print("Do you want a dog or cat: ");
        String choice = scan.nextLine().toLowerCase();

        if(choice.equals("dog")){
            animals = new f046_Dog();
            animals.speak();
        }else if(choice.equals("cat")){
            animals = new f046_Cat();
            animals.speak();
        }else{
            System.out.println("Type dog or cat only");
        }

    }

}
