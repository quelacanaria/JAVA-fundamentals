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

        String w = i.toString();
        String x = d.toString();
        String y = c.toString();
        String z = b.toString();

        System.out.println();

    }

}
