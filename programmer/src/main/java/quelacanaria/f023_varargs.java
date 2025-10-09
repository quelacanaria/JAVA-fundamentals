package quelacanaria;

public class f023_varargs {

    //varargs = allow a method to accept a varying #of arguments
    //make methods more flexible, no need for overloaded methods
    //java will pack arguments into an array
    //... (ellipsis)

    public static void main(String[] args) {

        System.out.println(add(1,2,3,4,5));

    }

    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){

            sum += number;


        }
        return sum;
    }

}
