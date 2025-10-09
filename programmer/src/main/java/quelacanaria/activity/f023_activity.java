package quelacanaria.activity;

import java.util.Random;
import java.util.Scanner;

public class f023_activity {
    //java slot machine
    public static void main(String[] args) {
        //display welcome message
        //play if balance > 0
        //ENTER BET AMOUNT
        //VERIFY IF BET > BALANCE
        //VERIFY IF BET > 0
        // SUBTRACT BET FROM BALANCE
        //SPIN ROW
        //PRINT ROW
        //GET PAYOUT
        //ASK TO PLAY
        //ASK TO PLAY AGAIN
        //DISPLAY EXIT MESSAGE
        Scanner scan = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbools: 🍒 🍋 🥭 🍉 🍓");
        System.out.println("*************************");

        while(balance > 0){

            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scan.nextInt();

            if(bet > balance){
                System.out.println("Insufficient Funds");

                continue;
            }else if(bet <= 0){

                System.out.println("Bet must be greater than zero");

                continue;

            }else{

                balance -= bet;

            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){

                System.out.println("You won $" + payout);
                balance += payout;

            }else {

                System.out.println("Sorry you lost this round");

            }

        }


    }


    static String[] spinRow(){

        String[] symbols = {"🍒", "🍋", "🥭", "🍉", "🍓" };
        String[] row = new String[3];
        Random random = new Random();



        for(int i = 0; i < 3; i++){

            row[i] = symbols[random.nextInt(symbols.length)];

        }

        return row;
    }

    static void printRow(String[] row){

        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){

            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🥭" -> bet * 5;
                case "🍉" -> bet * 10;
                case "🍓" -> bet * 20;
                default -> 0;
            };

        }else if(row[0].equals(row[1]) ){

            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🥭" -> bet * 4;
                case "🍉" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };

        }else if(row[1].equals(row[2])){

            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🥭" -> bet * 4;
                case "🍉" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };

        }
        return 0;
    }


}
