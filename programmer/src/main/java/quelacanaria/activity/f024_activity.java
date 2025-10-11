package quelacanaria.activity;

import java.util.ArrayList;
import java.util.Scanner;
//Arraylist = A resizeable array that stores objects (autoboxing )
//Arrays are fixed in sized, but Arraylists can change.
public class f024_activity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> sodaDrinks = new ArrayList<>();

        System.out.print("\nEnter how many drinks you want: ");
        int numOfSodaDrinks = scan.nextInt();
        scan.nextLine();

        for(int i = 1; i <= numOfSodaDrinks; i++){

            System.out.printf("Soda Drink #%d: ", i);
            String sodaDrink = scan.nextLine();
            sodaDrinks.add(sodaDrink);

        }
        System.out.println();
        System.out.println(sodaDrinks);
        System.out.println();
        for(int i = 0; i < sodaDrinks.size(); i++){
            System.out.println(i+1 + ". " + sodaDrinks.get(i));
        }
    }

}
