package quelacanaria.activity;
//MAD LIBS GAME
import java.util.Scanner;

public class f002_activity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective (description)");
        adj1 = scan.nextLine();
        System.out.println("Enter a noun (animal or person)");
        noun1 = scan.nextLine();
        System.out.println("Enter an adjective (description)");
        adj2 = scan.nextLine();
        System.out.println("Enter a verb end with -ing (action)");
        verb1 = scan.nextLine();
        System.out.println("Enter an adjective (description)");
        adj3 = scan.nextLine();

        System.out.println("\nToday I went to a " + adj1 + " zoo ");
        System.out.println("In a exhibit, I saw a " + noun1 + " . ");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        scan.close();

//        Today I went to a  cute zoo
//        In a exhibit, I saw a  dog .
//        dog was smells bad and acting!
//        I was mabango!


    }

}
