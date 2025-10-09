package quelacanaria.activity;

import java.util.Scanner;

public class f018_activity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size;
        String target = "gg";

        System.out.print("Enter the size of an array: ");
        size = scan.nextInt();
        scan.nextLine();
        String[] foods = new String[size];

//        foods[0] = "pan de coco";
//        foods[1] = "cheese roll";
//        foods[2] = "hamburger";

        for(int i = 0; i < size; i++){

            System.out.println("Enter the body of array: " + i);
            foods[i] = scan.nextLine();


        }
        System.out.println("The string of array you choose");
        for( String food : foods){

            System.out.println(food);

        }

    }

}
