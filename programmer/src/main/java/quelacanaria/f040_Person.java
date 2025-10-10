package quelacanaria;
//super refers to the parent class (subclass <-superclass) used in constructor
//and method overriding calls the parent constructor to initialize attributes
public class f040_Person {

    String firstname;
    String lastname;

    f040_Person(String firstname, String lastname){

        this.firstname = firstname;
        this.lastname = lastname;
    }

    void fullName(){

        System.out.println(firstname + " " + lastname);

    }

}
