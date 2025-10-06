package quelacanaria;

import java.util.Scanner;

public class f011_switch {

    public static void main(String[] args) {

        String day;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a day: ");
        day = scan.nextLine();

        switch(day){

            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("It is not a day");
                break;

        }

        switch(day){

            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println("Today is weekday");
                break;
            case "Saturday":

            case "Sunday":
                System.out.println("Today is weekends");
                break;
            default:
                System.out.println("It is not a weekday or weekends");
                break;

        }
        System.out.println("\nswitch with ->");
        System.out.print("Enter a day: ");
        day = scan.nextLine();

        switch(day){

            case "Monday" -> System.out.println("Today is Monday");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thursday" -> System.out.println("Today is Thursday");
            case "Friday" -> System.out.println("Today is Friday");
            case "Saturday" -> System.out.println("Today is Saturday");
            case "Sunday" -> System.out.println("Today is Sunday");
            default -> System.out.println("it is not a day");

        }

        switch(day){

            case "Monday" ,"Tuesday" , "Wednesday" , "Thursday" , "Friday"
                    -> System.out.println("Today is weekday");

            case "Saturday" , "Sunday"
                    -> System.out.println("Today is weekends");

            default -> System.out.println("it is not a day");

        }

    }

}
