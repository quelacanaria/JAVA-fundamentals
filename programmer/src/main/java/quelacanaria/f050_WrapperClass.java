package quelacanaria;
//Wrapper class allow primitive values(int, char, double, boolean) to be used as objects.
//"Wrap them in an object" Generally, don't wrap primitives unless you need an object.
//Allows use of Collections Framework and static Utility Methods.
public class f050_WrapperClass {
    public static void main(String[] args) {

    //Autoboxing
        Integer i = 1;
        Double d = 2.00;
        Character c = 'a';
        Boolean b = true;

        //Unboxing
//        int I = i;
//        double D = d;
//        char C = c;
//        boolean B = b;

//        String w = i.toString();
//        String x = d.toString();
//        String y = c.toString();
//        String z = b.toString();

//        int w = Integer.parseInt("123");
//        double x = Double.parseDouble("3.14");
//        boolean y = Boolean.parseBoolean("true");
        char z = "1".charAt(0);


//        String q = Integer.toString(123);
//        String w = Double.toString(20);
//        String e = Boolean.toString(true);
//        String r = Character.toString('c');

        System.out.println(Character.isLetter(z));
        System.out.println(Character.isUpperCase(z));


    }

}
