package quelacanaria.activity;

import java.util.Scanner;

public class f019_activity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println(average());




    }

    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){

            return 0;

        }

        for(double number : numbers){

            sum += number;

        }

        return sum/numbers.length;

    }

}
