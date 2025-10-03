package quelacanaria.activity;

import java.util.Scanner;
//Calculate the area of triangle
public class f001_activity {

    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the width of triangle: ");
        width=scan.nextDouble();

        System.out.print("Enter the height of triangle: ");
        height=scan.nextDouble();

        area = width * height;

        System.out.println("The width is " + width + " and the height is " + height + " so that the area of triangle is " + area+ " cm^2");

        scan.close();
    }

}
