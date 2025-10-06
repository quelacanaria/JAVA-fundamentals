package quelacanaria;

import java.util.Scanner;

public class f015_forLoop {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        int max;
        System.out.println("Increment by 1");
        for(int i = 0; i < 10; i++){

            System.out.println(i);

        }
        System.out.println("Increment by 2");
        for(int i = 0; i < 10; i+=2){

            System.out.println(i);

        }
        System.out.print("How many numbers do you want to print?: ");
        max = scan.nextInt();
        for(int i = 0; i < max; i++){

            System.out.println(i);

        }
        System.out.println("End of the program\n");
        for(int i = 10; i > 0; i--){

            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("Happy new year");

    }

}
