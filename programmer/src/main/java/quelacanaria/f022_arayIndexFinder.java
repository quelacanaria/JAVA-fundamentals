package quelacanaria;

import java.util.Scanner;

public class f022_arayIndexFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] adobo = {"Raw chicken", "Soy sauce", "Vinegar"};

//        for(int i = 0; i < adobo.length; i++){
//
//            System.out.println(adobo[i]);
//
//        }
        System.out.println("");
        for(String adobos : adobo){

            System.out.print(adobos + ", ");

        }

        System.out.print("\n\nEnter you want to find the index in array: ");
        String target = scan.nextLine();

        boolean isFound = false;

        for (int i = 0; i < adobo.length; i++){

            if( adobo[i].equals(target)){

                System.out.println("The index number of " + target + " is " + i);
                isFound = true;
                break;

            }

        }

        if(!isFound) {
            System.out.println("Element not found in the array");
        }

    }

}
