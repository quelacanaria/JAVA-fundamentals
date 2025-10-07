package quelacanaria.activity;

import java.util.Scanner;

public class f016_activity {
    //Banking app CLI

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

    do{

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");

        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");

        System.out.print("Enter your choice 1-4: ");
        choice = scan.nextInt();

        switch(choice){

            case 1 -> showBalance(balance);
            case 2 -> System.out.println("DEPOSIT");
            case 3 -> System.out.println("WITHDRAW");
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid choice");

        }

    }while(isRunning);

    }

    static void showBalance(double balance){

        System.out.println("***************");
        System.out.println("SHOW BALANCE");
        System.out.printf("Balance: $%,.2f\n", balance);

    }
    static double deposit(){

        double amount;

        return 0;

    }
}
