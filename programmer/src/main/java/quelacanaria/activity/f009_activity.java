package quelacanaria.activity;

import java.util.Scanner;
//email
public class f009_activity {

    public static void main(String[] args) {

        String email;
        String username;
        String domain;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter your eamail account: ");
        email = scan.nextLine();

        if(email.contains("@") && email.length()>=10){

            username = email.substring(0, email.indexOf("@"));

            domain = email.substring(email.indexOf("@"));

            System.out.println("email: " + email);
            System.out.println("username: " + username);
            System.out.println("domain: " + domain);

        }else{

            System.out.println("invalid email!!");

        }


        scan.close();


    }

}
