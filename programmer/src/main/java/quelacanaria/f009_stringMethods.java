package quelacanaria;

public class f009_stringMethods {

    public static void main(String[] args) {

        String name = "Quekeneth";
        //it will count the number of letters to a string starting to 0
        System.out.println("String Methods name.length(); = " + name.length());

        //it prints the letter based on it's index number
        System.out.println("String Methods name.charAt(); = " + name.charAt(1));

        //it prints the first index number based on it's first occurance letter
        System.out.println("String Methods name.indexOf(); = " + name.indexOf("e"));

        //name.toUpperCase() it uppercase all the letters to a specific string
        System.out.println("String Methods name.toUppercase(); = " + name.toUpperCase());

        //name.toUpperCase() it uppercase all the letters to a specific string
        System.out.println("String Methods name.toLowercase(); = " + name.toLowerCase());

        //it removes all the spaces before and after the string
        System.out.println("String Methods name.trim(); = " + name.trim());

        //it replace all the 1st parameter by the second parameter
        System.out.println("String Methods name.replace(a,b) = " + name.replace("e", "i"));

        //it checks if it is the string is empty or not
        System.out.println("String Methods name.isEmpty() = " + name.isEmpty());

        //it checks if it is contains the value of string that you in put as parameter
        System.out.println("Stirng Methods name.contains() = " + name.contains(""));

        //it checks if the string is equals to the parameter
        System.out.println("String Methods name.equals()" + name.equals("Quekeneth"));

        //it checks if the string is equals to the parameter but it ignores all the cases
        System.out.println("String Methods name.equalsIgnoreCase() = " + name.equalsIgnoreCase("Quekeneth"));

        //it prints the specific letters of string based on start point and end point
        System.out.println("String Methods name.substring() = " + name.substring(0,6));





    }

}
