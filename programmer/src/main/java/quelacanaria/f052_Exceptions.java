package quelacanaria;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exceptions an event that interrupts the normal flow of program (DIviding by zero,
//file not found, mismatch input type) Surround any dangerous code with a try{}
//block try{}, catch{}, finally{}
public class f052_Exceptions {
    public static void main(String[] args) {


        try{
            System.out.println(1/0);
        }
        catch(Exception e){
            System.out.println("you can't divide by zero!");
        }


        try(Scanner scan = new Scanner(System.in)){
            System.out.print("\nEnter any number: ");
            int number = scan.nextInt();
            System.out.println("The number you enter: " + number);
        }catch(ArithmeticException e){
            System.out.println("That wasn't a number lol");
        }catch(InputMismatchException e){
            System.out.println("you can't divide by zero!");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("the finally executes");
        }

    }
}
