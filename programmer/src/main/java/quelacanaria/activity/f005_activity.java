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

        raduis = scan.nextDouble();

        circumference = 2 * Math.PI * raduis;
        area = Math.PI * Math.pow(raduis,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(raduis,3);

    }

}

