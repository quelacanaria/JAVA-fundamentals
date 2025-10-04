package quelacanaria;

public class f006_mathMethods {

    public static void main(String[] args) {

        //MATH CONSTANTS

        //PI value
        System.out.println("This is the result for Math.PI: "+Math.PI);
        //
        System.out.println("This is the result for Math.E: "+Math.E);

        //MATH METHODS

        //value and exponential
        double number = Math.pow(5,3);
        System.out.println("This is the result for Math.pow(): "+number);
        //absolute value
        double number1 = Math.abs(-1);
        System.out.println("This is the result for Math.abs(): "+number1);
        //square root of the parameter
        double number2 = Math.sqrt(9);
        System.out.println("This is the result for Math.sqrt(): "+number2);
        //round off to the nearest whole digit
        double number3 = Math.round(3.14);
        System.out.println("This is the result for Math.round(): "+number3);
        //round off up
        double number4 = Math.ceil(5.14);
        System.out.println("This is the result for Math.ceil(): "+number4);
        //round dff down
        double number5 = Math.floor(3.99);
        System.out.println("This is the result for Math.floor(): "+number5);
        //max value of parameters
        double number6 = Math.max(3,10);
        System.out.println("This is the result for Math.max(): "+number6);
        //min value of parameters
        double number7 = Math.min(3,10);
        System.out.println("This is the result for Math.min(): "+number7);
        //cuberoot of any numbers
        double number8 = Math.cbrt(125);
        System.out.println("This is the result for Math.cbrt(): "+number8);
    }

}
