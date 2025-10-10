package quelacanaria;
//super refers to the parent class (subclass <-superclass) used in constructor
//and method overriding calls the parent constructor to initialize attributes
public class f040_Employee extends f040_Person{

    int salary;

    f040_Employee(String firstname, String lastname, int salary){

        super(firstname, lastname);
        this.salary = salary;

    }

    void showSalary(){

        System.out.println(this.firstname + "'s is salary is $" + this.salary);

    }

}
