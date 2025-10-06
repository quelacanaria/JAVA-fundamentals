package quelacanaria.activity;

import java.util.Random;
import java.util.Scanner;

public class f015_activity {
//guessing game
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int min = 1;
        int max = 10;

        do{
            System.out.println("Number Guessing game");
            System.out.print("Guess a number 1-10: ");

            guess = scan.nextInt();
            System.out.println("random number: " + random.nextInt(min,max));


        }while(guess != random.nextInt(min,max));

        System.out.println("Congrats you win!!");


    }

}
