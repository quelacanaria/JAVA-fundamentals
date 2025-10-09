package quelacanaria.activity;

import java.util.Random;
import java.util.Scanner;

public class f022_activity {
    //Rock, Paper, Scissors

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String aiPlayer;
        String player;
        int attempts = 1;
        String playAgain = "yes";
        String[] rps = {"rock", "paper", "scissors"};

        aiPlayer = rps[random.nextInt(0,3)];
        do {

            System.out.println("Rock, Paper, Scissors Game");

            System.out.print("Player pick: ");
            player = scan.nextLine().toLowerCase();

            if (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {

                System.out.println("Invalid pick");
            }

            System.out.println("Computer pick: " + aiPlayer);
            ;

            if (player.equals(aiPlayer)) {

                System.out.println("It's a tie!!");

            } else if ((player.equals("scissors") && aiPlayer.equals("paper")) ||
                    (player.equals("paper") && aiPlayer.equals("rock")) ||
                    (player.equals("rock") && aiPlayer.equals("scissors"))) {

                System.out.println("You win!!");

            } else {

                System.out.println("You lose😒😒");

            }

            System.out.println("Play again?? (yes or no): ");
            playAgain = scan.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!!");

        scan.close();
    }
}
