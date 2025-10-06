package quelacanaria.activity;

import java.util.Scanner;

public class f011_activity {

    public static void main(String[] args) {

        String unit;
        double temp;
        double newTemp;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        temp = scan.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scan.next().toUpperCase();//METHOD CHAINING

        System.out.println((unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32);
        System.out.println("");
        scan.close();

    }
}
