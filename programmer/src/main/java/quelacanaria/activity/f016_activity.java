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
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
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

        System.out.print("Enter an amount to deposit: ");
        amount = scan.nextDouble();

        if(amount < 0){

            System.out.println("Amount can't be negative");
            return 0;

        }else{

            return amount;

        }

    }

    static double withdraw(double balance){
        double withdraw;

        System.out.print("Enter an amount to withdraw: ");
        withdraw = scan.nextDouble();

        if(withdraw < 0){
            System.out.println("Withdraw can't be negative zero");
            return 0;
        }else {

            if (withdraw > balance){
                System.out.println("You can't withdraw");

                return 0;

            }else {
                return withdraw;
            }

        }
    }
}
