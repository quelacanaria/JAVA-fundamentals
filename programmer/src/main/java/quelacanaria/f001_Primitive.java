package quelacanaria;

public class f001_Primitive {

    public static void main(String[] args) {
        // Primitive = simple value stored directly in memory(stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive-int, double, char, boolean, short, long, float
        // Reference-String, array, object

        // creating a variable

        // 1. datatype - int, double, long, char, boolean, short, String,  array, object, float
        // 2. variable declaration - anything in abc
        // 3. assignment - anything as long as it fits the datatype

        int grade = 90;
        int topNumber = 1;
        int numberStudents = 50;
        double price = 500_000.00;
        char remarks = 'A';
        boolean isPass = true;
        String name = "Sarah Discaya";
        String luxuryCar = "Bently Bentayga";
        String passed = "";
        if(isPass == true){
            passed = "Pass";
        }else{
            passed = "passed away";
        }

        System.out.println("\n"+name + " was once a top " + topNumber + " in her class of over "
                + numberStudents + " . Out of those, only 30 managed to "+ passed + " and she earned an impressive " + remarks + "+ "
                + grade + " \nAs a reward for her achievement, her father gave her $" + price
                + " to buy her dream car a " + luxuryCar);


    }

}