package quelacanaria.activity;

import java.util.Scanner;
//game press Q to quit
public class f014_activity {

    public static void main(String[] args) {

        String response = "";

        Scanner scan = new Scanner(System.in);

        while(!response.equals("Q")){

            System.out.println("You are playing a game");
            System.out.println("press Q to quit");
            response = scan.next().toUpperCase();

        }

        System.out.println("You have quit the game");

        scan.close();

    }

}
