package quelacanaria.activity;

import java.util.Scanner;
//password
public class f008_activity {

    public static void main(String[] args) {

        String email;
        String password;
        String username;
        String domain;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter your eamail account: ");
        email = scan.nextLine();

        System.out.print("Enter your password: ");
        password = scan.nextLine();

        username = email.substring(0, email.indexOf("@"));

        domain = email.substring(email.indexOf("@"));

        System.out.println("email: " + email);
        System.out.println("username: " + username);
        System.out.println("domain: " + domain);

        if(password.length() >= 10){
            System.out.println("Your password is strong");
        }else{
            System.out.println("Your password is weak");
        }
        System.out.println("password: " + password);

        scan.close();

    }

}
