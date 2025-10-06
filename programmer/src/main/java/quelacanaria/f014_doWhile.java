package quelacanaria;

import java.util.Scanner;

public class f014_doWhile {

    public static void main(String[] args) {

        int age = 0;
        int number = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Enter your age: ");
            age = scan.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");

        do{

            System.out.print("Enter a number between 1-10: ");
            number = scan.nextInt();

        }while(number < 1 || number > 10);

        System.out.println("You enter number " + number);

        scan.close();


    }

}
