package quelacanaria;

public class f007_printf {
    //printf() = is a method used to format output in terminal
    //%[specifier-character][flags][width][.precision]


    public static void main(String[] args) {

        String name = "Quekeneth";
        char firstLetter ='Q';
        int age = 23;
        double height = 171.6;
        boolean isEmployed = false;

        //%[specifier-character]

        System.out.println("\nPrintf character specifier");

        System.out.printf("\nwassup %s\n",name);
        System.out.printf("Why your name starts with %c?\n",firstLetter);
        System.out.printf("How old are you %d?\n", age);
        System.out.printf("What is your height %f?\n", height );
        System.out.printf("Do you have a job right now %b?\n\n",isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        System.out.println("\nprintf with flags ");

        //[flags]

        // + = output a plus to every positive value
        // , = comma grouping
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = -100000000.99;
        double price2 = 100000000.99;

        System.out.printf("\n%+f\n", price1);
        System.out.printf("%,f\n", price1);
        System.out.printf("%(f\n", price1);
        System.out.printf("% f\n", price1);
        System.out.printf("%,(f\n", price1);

        System.out.printf("\n%+f\n", price2);
        System.out.printf("%,f\n", price2);
        System.out.printf("%(f\n", price2);
        System.out.printf("% f\n", price2);
        System.out.printf("%,+(f\n", price2);

        System.out.println("\nprintf with precision ");

        //[.precision]

        // .1, .2, .3, .4, .5, etc...

        System.out.printf("\n%,.1f\n", price1);
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.3f\n", price1);
        System.out.printf("%,.10f\n", price1);

        //[.width]

        System.out.println("\nprintf with width ");

        int price3 = 1;
        int price4 = 23;
        int price5 = 456;

        System.out.printf("\n%03d\n", price3);
        System.out.printf("%03d\n", price4);
        System.out.printf("%d\n", price5);

        System.out.printf("\n%3d\n", price3);
        System.out.printf("%3d\n", price4);
        System.out.printf("%d\n", price5);

        System.out.printf("\n%-3d\n", price3);
        System.out.printf("%-3d\n", price4);
        System.out.printf("%d\n", price5);





    }

}
