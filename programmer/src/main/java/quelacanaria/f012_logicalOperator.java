package quelacanaria;

public class f012_logicalOperator {

    public static void main(String[] args) {

        // && = AND
        // || = OR
        // !  = NOT

        double temp = 40;
        boolean isSunny = true;

        if(temp >= 0 && temp <= 30 && isSunny){
            System.out.println("The weather is Good");
            System.out.println("It is sunny outside");
        }
        else if(temp >= 0 && temp <= 30 && !isSunny){
            System.out.println("The weather is Good");
            System.out.println("It is cloudy outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }
    }

}
