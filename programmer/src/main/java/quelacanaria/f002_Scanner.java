package quelacanaria;

import java.util.Scanner;

public class f002_Scanner {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your Age: ");
    int age = scan.nextInt();
    scan.nextLine();//preventing the error

    System.out.print("Enter your name: ");
    String name = scan.nextLine();

    System.out.print("What is you GPA: ");
    double gpa = scan.nextDouble();

    System.out.print("Are you a programmer? (true or false)");
    boolean isProgrammer = scan.nextBoolean();

    System.out.print("\nhi my name is " + name + " and my age is "+ age + " and my GPA is: " + gpa);

        if(isProgrammer == true){
            System.out.print(" Wow you're a programmer superb");
        }else{
            System.out.print("Ah you're not a programmer walang bitaw");
        }

        scan.close();

}
}
