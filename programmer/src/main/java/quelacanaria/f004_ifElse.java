package quelacanaria;

import java.util.Scanner;

public class f004_ifElse {

    public static void main(String[] args) {
        int age;
        String name;
        Scanner scan = new Scanner(System.in);
        boolean isStudent;
        System.out.print("Enter your Name: ");
        name = scan.nextLine();

        System.out.print("Enter your Age: ");
        age = scan.nextInt();

        System.out.print("Are you a student (true or false) ");
        isStudent = scan.nextBoolean();

        //Name ifElse
        if(name.isEmpty()){
            System.out.println("You didn't put your name!!");
        }else{
            System.out.println("What a nice name " + name);
        }

        //Age ifElse
        if(age >=50){
            System.out.println("Woah!! you're a Golden Ager");
        }
        else if(age >= 18){
            System.out.println("You're in the Legal Age now");
        }
        else if(age < 0){
            System.out.println("You’re still in your mother’s womb");
        }
        else if(age == 0){
            System.out.println("Wow a cutie little baby");
        }
        else {
            System.out.println("You're not Legal Age now");
        }

        if(isStudent){
            System.out.print("Oh you're working now impressive");
        }else{
            System.out.print("Wow that's nice ");
        }
        scan.close();
    }

}
