package quelacanaria.activity;

import java.util.Random;
import java.util.Scanner;

public class f015_activity {
//guessing game
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        int guess;
        int attemps = 1;
        int min = 1;
        int max = 10;
        int numRandom = random.nextInt(min, max);


        do{

            System.out.print("Enter a number: ");
            guess = scan.nextInt();

            if(guess > numRandom){
                System.out.println("lower!!");
            }else if(guess < numRandom){
                System.out.println("higher!!");
            }else{
                System.out.println("The random number is: " + numRandom);
                System.out.println("Woah your guess was right!! ");
            }
            System.out.println("attempts: " + attemps++);
        }while(guess != numRandom);

        System.out.println("You win!!");




    }

}
