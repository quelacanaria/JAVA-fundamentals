package quelacanaria.activity;

import java.util.Scanner;

//Shopping Cart program
public class f003_activity {

    public static void main(String[] args) {

        String product;
        double price;
        int quantity;
        double total;

        Scanner scan = new Scanner(System.in);

        System.out.print("What do you like to buy: ");
        product = scan.nextLine();

        System.out.print("How much for the product: ");
        price = scan.nextDouble();

        System.out.print("How many do you like?: ");
        quantity = scan.nextInt();

        total = price * quantity;

        System.out.println("\nWelcome QueQueSTORE ");

        System.out.println("\nOrder: " + product);
        System.out.println("Price: $" + price);
        System.out.println("Qty: " + quantity);
        System.out.println("total: " + total);

        scan.close();
    }

}
