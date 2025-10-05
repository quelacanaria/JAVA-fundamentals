package quelacanaria.activity;

import java.util.Scanner;

public class f007_activity {

    //Compound Interest Calculator
    //A=P[1+r/n]^nt

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principal = scan.nextDouble();

        System.out.print("Enter the interest rate%: ");
        rate = scan.nextDouble()/100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scan.nextInt();

        System.out.print("Enter the number of years: ");
        years = scan.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //System.out.println("The amount after " + years + " is: $" + amount);
        System.out.printf("\nThe amount after %d is: $%,.1f",years,amount);

        scan.close();

    }

}
