package quelacanaria;

public class f028_StudentsConstructor {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    f028_StudentsConstructor(String name, int age, double gpa){

        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;

    }
    void study(){

        System.out.println(this.name + " is studying");

    }
}
