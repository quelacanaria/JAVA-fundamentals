package quelacanaria.activity;

public class f020_activity {

    public static void main(String[] args) {

        char[][] keypad = {{'1', '2', '3'},
                           {'4', '5', '6'},
                           {'7', '8', '9'},
                           {'*', '0', '#'}};

        for(char[] phone : keypad){

            for(char keypads : phone){

                System.out.print(keypads + " ");

            }
            System.out.println();

        }

    }

}
