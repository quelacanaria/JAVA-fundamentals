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
        String[] rps = {"rock", "paper", "scissors"};

        aiPlayer = rps[random.nextInt(0,3)];

        System.out.print("Enter your move (rock, paper, scissors) ");
        player = scan.nextLine().toLowerCase();

        if(!player.equals("rock")&&!player.equals("paper")&&!player.equals("scissors")){
            System.out.println("Invalid choice");
        }

    }
}
