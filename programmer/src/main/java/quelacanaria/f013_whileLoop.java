package quelacanaria;

import java.util.Scanner;
//WHILE LOOP
//do while and while loop is the same
//f014 and f015 activity
public class f013_whileLoop {

    public static void main(String[] args) {

        String name = "";

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Enter your name: ");
            name =scan.nextLine();
        }while(name.isEmpty());

//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name =scan.nextLine();
//        }

        System.out.println("Hello " + name);
        scan.close();

    }

}
