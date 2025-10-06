package quelacanaria.activity;

import java.util.Scanner;

public class f015_activity {

    public static void main(String[] args) {

        int age = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");

        while(age < -1){
            System.out.print("Enter your age: ");
            age = scan.nextInt();
        }


    }

}
