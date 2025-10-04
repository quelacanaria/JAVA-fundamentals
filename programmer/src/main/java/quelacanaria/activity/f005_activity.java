package quelacanaria.activity;

import java.util.Scanner;

public class f005_activity {

    //circumference = 2 * Math.PI * raduis;
    //area = Math.PI * Math.pow(raduis,2);
    //volume = (4.0/3.0) * Math.PI * Math.pow(raduis,3);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double circumference;
        double raduis;
        double area;
        double volume;

        System.out.print("\nEnter the raduis of the circle: ");
        raduis = scan.nextDouble();

        circumference = 2 * Math.PI * raduis;
        area = Math.PI * Math.pow(raduis,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(raduis,3);
        System.out.println("\n Without printf");
        System.out.println("\nthe circumference of the circle is: " + circumference + " cm");
        System.out.println("the area of the circle is: " + area + " cm^2");
        System.out.println("the volume of the circle is " + volume + " cm^3");
        System.out.println("\n with printf");
        System.out.printf("\nThe circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm^2\n", area);
        System.out.printf("The volume is: %.1fcm^3\n", volume);

        scan.close();

    }

}

