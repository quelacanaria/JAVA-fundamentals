package quelacanaria;

import java.util.Random;

public class f005_Random {

    public static void main(String[] args) {

        double number;
        int number1;
        boolean number2;
        //generate random of value based on data type
        Random random = new Random();

        number = random.nextDouble();//you can add parameters to set some limitations
        number1 = random.nextInt();//you can add parameters to set some limitations
        number2 = random.nextBoolean();

        System.out.println("This the result for Double: "+number);
        System.out.println("This the result for Int: "+number1);
        System.out.println("This the result for Boolean: "+number2);
    }





}
