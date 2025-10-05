package quelacanaria.activity;

import java.util.Scanner;

public class f007_CIC {

    //Compound Interest Calculator

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

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scan.nextInt();

        System.out.println("Enter the amount: ");
        amount = scan.nextDouble();


        scan.close();

    }

}
