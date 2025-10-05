package quelacanaria.activity;

import java.util.Scanner;

public class f010_activity {
        //weight conversion program
        //1. convert lbs to kgs
        //2. convert kgs to lbs
        public static void main(String[] args) {

            int option;
            double weight;
            double newWeight;

            Scanner scan = new Scanner(System.in);

            System.out.println("Weight Conversion Program");
            System.out.println("1. Convert lbs to kgs: ");
            System.out.println("2. Convert kgs to lbs: ");
            System.out.print("Choose an option: ");
            option = scan.nextInt();

            if(option == 1){
                System.out.print("Enter weight in lbs: ");
                weight = scan.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The new weight in kgs is %.2f", newWeight);

            }else if(option == 2){
                System.out.print("Enter weight in kgs: ");
                weight = scan.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is %.2f", newWeight);
            }else{

                System.out.println("Invalid option!!");

            }

            scan.close();

        }




}
