package quelacanaria;

import java.util.Arrays;

public class f021_array {

    public static void main(String[] args) {

        String[] fruits = { "apple", "orange", "banana", "coconut"};

        //fruits[0] = "pomelo";
//        System.out.println(fruits.length);
//        System.out.println(fruits[0]);

        //to alphabetically sort the array of strings
        Arrays.sort(fruits);

        // fill the array with the string
        //Arrays.fill(fruits, "gg");

            //same with for each and enhance for loop
//        for(int i = 0; i < fruits.length; i++){
//
//            System.out.println(fruits[i]);
//
//        }
        //for each or enhance for loop
        for(String prutas : fruits){

            System.out.println(prutas);

        }

    }

}
