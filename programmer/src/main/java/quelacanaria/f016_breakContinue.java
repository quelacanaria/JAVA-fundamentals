package quelacanaria;

public class f016_breakContinue {

    public static void main(String[] args) {
        //break
        //continue

        System.out.println("\nBreak in loop or stop: ");
        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }

            System.out.print(i + " ");

        }

        System.out.println("\nContinue in loop or skip: ");
        for(int i = 0; i < 10; i++){

            if(i == 5){
                continue;
            }

            System.out.print(i + " ");

        }

    }

}
