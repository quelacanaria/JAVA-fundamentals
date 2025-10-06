package quelacanaria;

public class f018_methods {

    public static void main(String[] args) {
        //methods = block of reusable code that is executed when called
        int age = 23;
        String name = "Hinata";
        //String name = "star";
        int age2 = 22;

        if(isLegalAge(age2)){
            System.out.println("You are legal age now");
        }else{
            System.out.println("You are not legal age now");
        }


        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(add( 2, 3));
        System.out.println(subtract(500,250));
        System.out.println(getFullname("Hinata", "Shoyo"));
        isSing(name, age);


    }
    static void isSing(String name1, int age1){

        System.out.println("\nHappy birthday to you!");
        System.out.printf("Happy birthday %s\n", name1);
        System.out.printf("You are %d years old\n", age1);
        System.out.println("Happy birthday to you!");

    }

    static double square(double num){return num * num;}

    static double cube(double num){return num * num * num;}

    static double add(double num1, double num2){return num1 + num2;}

    static int subtract(int num1, int num2){return num1 - num2;}

    static String getFullname(String firstname, String lastname)
                    {return firstname + " " + lastname;}

    static boolean isLegalAge(int age){
        if(age >= 17){
            return true;
        }else{
            return false;
        }
    }
}
