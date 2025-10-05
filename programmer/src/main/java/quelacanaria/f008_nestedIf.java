package quelacanaria;

public class f008_nestedIf {

    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){

            if(isSenior){
                System.out.println("You get a senior discount of 20% ");
                System.out.println("You get a student discount of 10% ");
                price *= 0.7;//30%
            }else{

                System.out.println("You get a student discount of 10% ");
                price *= 0.9;//10%

            }

        }else{

            if(isSenior){

                System.out.println("You get a senior discount of 20% ");
                price *= 0.8;//30%

            }else{

                price *= 1;

            }

        }

        System.out.printf("The ticket price is $%,.2f",price);

    }

}
