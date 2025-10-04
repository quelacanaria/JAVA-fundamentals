package quelacanaria.activity;

import java.util.Scanner;
//MATH METHOD activity
public class f004_activity {

    public static void main(String[] args) {

        //HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter value of a: ");
        a = scan.nextDouble();

        System.out.print("Enter value of b: ");
        b = scan.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("a = "+Math.pow(a,2));
        System.out.println("b = "+Math.pow(b,2));
        System.out.println("c = "+c+" cm");

        scan.close();


    }


}
