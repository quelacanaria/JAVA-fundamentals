package quelacanaria;

public class f020_variableScope {

    static int x = 3;//CLASS VARIABLE

    public static void main(String[] args) {

        int x = 1;//LOCAL VARIABLE

        System.out.println(x);
        System.out.println(x);
        doSomething();


    }

    static void doSomething(){

        int x =2;//LOCAL VARIABLE

        System.out.println(x);

    }
}
