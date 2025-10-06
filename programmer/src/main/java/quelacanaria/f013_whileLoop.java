package quelacanaria;

import java.util.Scanner;

public class f013_whileLoop {

    public static void main(String[] args) {

        String name = "";

        Scanner scan = new Scanner(System.in);

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name =scan.nextLine();
        }

        System.out.println("Hello " + name);
        scan.close();

    }

}
