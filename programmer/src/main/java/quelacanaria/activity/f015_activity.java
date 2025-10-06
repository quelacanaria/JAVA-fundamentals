package quelacanaria.activity;

import java.util.Scanner;

public class f015_activity {

    public static void main(String[] args) {

        int age = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        while(age < 0){
            System.out.println("Invalid you haven't born yet");
            System.out.print("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("You are " + age + " years old");

    }

}
