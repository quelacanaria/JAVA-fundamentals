package quelacanaria.activity;

import java.util.Scanner;

//calculator
public class f012_activity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1;
        double num2;
        char operation;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scan.nextDouble();

        System.out.print("Enter an operation +, -, *, /, ^: ");
        operation = scan.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scan.nextDouble();

        switch (operation){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot be divided by zero!!");
                    validOperation = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operation");
            validOperation = false;
            }

        }

        if(validOperation){
            System.out.println(result);
        }

        scan.close();

    }

}
