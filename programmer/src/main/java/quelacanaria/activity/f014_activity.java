package quelacanaria.activity;

import java.util.Scanner;
//game press Q to quit
public class f014_activity {

    public static void main(String[] args) {

        String response = "";
        int age = 0;
        Scanner scan = new Scanner(System.in);

        while(!response.equals("Q")){

            System.out.println("You are playing a game");
            System.out.print("press Q to quit: ");
            response = scan.next().toUpperCase();

        }

        System.out.println("You have quit the game");

        System.out.println("\nenter +numbers only");
        System.out.print("Enter your age: ");
        age = scan.nextInt();

        while(age < 0){
            System.out.println("\nnvalid you haven't born yet");
            System.out.print("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("You are " + age + " years old");

        scan.close();

    }

}
