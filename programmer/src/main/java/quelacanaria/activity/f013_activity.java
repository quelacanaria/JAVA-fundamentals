package quelacanaria.activity;

import java.util.Scanner;
    //email checker
public class f013_activity {

    public static void main(String[] args) {

        String username;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your new username: ");
        username = scan.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4-12 characters");
        }
        else if(username.contains(" ")||username.contains(" ")){
            System.out.println("username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scan.close();

    }

}
