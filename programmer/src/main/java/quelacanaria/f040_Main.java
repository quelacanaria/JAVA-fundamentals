package quelacanaria;
//super refers to the parent class (subclass <-superclass) used in constructor
//and method overriding calls the parent constructor to initialize attributes
public class f040_Main {
    public static void main(String[] args) {

        f040_Person person1 = new f040_Person("Gojo", "Saturo");
        f040_Person person2 = new f040_Person("Menma", "Sukuna");
        f040_Student student1 = new f040_Student("Aaron", "Aeronshiki", 1.25);
        f040_Employee employee1 = new f040_Employee("Rodwin", "Diaz", 30000);

        System.out.println(person1.firstname);
        System.out.println(person2.lastname);

        person1.fullName();

        System.out.println(student1.firstname);
        System.out.println(student1.lastname);
        System.out.println(student1.gpa);

        student1.fullName();
        student1.showGpa();

        employee1.fullName();
        employee1.showSalary();



    }
}
