package quelacanaria;

public class f019_overloadedMethods {
    public static void main(String[] args) {
        //methods that share the same name but different parameters

        System.out.println(add(2,2,10));
        System.out.println(bakePizza("flat bread ", "mozzarella", "pepperoni"));

    }
    static double add(int a, int b){
        return a + b;
    }
    static double add(int a, int b, int c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + "pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + "pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + "pizza";
    }
}
