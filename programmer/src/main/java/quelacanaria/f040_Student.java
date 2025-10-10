package quelacanaria;
//super refers to the parent class (subclass <-superclass) used in constructor
//and method overriding calls the parent constructor to initialize attributes
public class f040_Student extends f040_Person {

    double gpa;

    f040_Student(String firstname, String lastname, double gpa){
        super(firstname,lastname);
        this.gpa = gpa;

    }

    void showGpa(){

        System.out.println(this.firstname + "'s gpa is " + gpa);

    }
}
