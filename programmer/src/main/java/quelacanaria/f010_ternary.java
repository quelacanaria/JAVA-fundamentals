package quelacanaria;

import java.util.Scanner;

public class f010_ternary {
    //ternary operator ?= Return 1 0f 2 values if a condition is true
    //variable = (condition) ? ifTrue : ifFalse
    public static void main(String[] args) {

        int input;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        input = scan.nextInt();
        System.out.println((input >= 75) ? "PASS" : "FAIL");

        System.out.print("Enter a number: ");
        input = scan.nextInt();
        System.out.println((input % 2 == 0) ? "EVEN" : "ODD" );

        System.out.print("Enter Military Time: ");
        input = scan.nextInt();
        if(input <= 24){

            System.out.println((input < 12) ? "AM" : "PM" );

        }else{

            System.out.println("Invalid time!!");

        }

        System.out.print("Enter salary: ");
        input = scan.nextInt();
        System.out.println((input >= 30000) ? 0.25 : 0.15);


        scan.close();

    }

}


