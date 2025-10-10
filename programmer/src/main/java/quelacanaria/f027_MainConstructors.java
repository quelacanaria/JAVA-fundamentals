package quelacanaria;

public class f027_MainConstructors {
        //A constructor is a special mmethod to initialized objects you can pass
        //arguments to a constructor and set up initial values

    public static void main(String[] args) {

        f028_StudentsConstructor student1 = new f028_StudentsConstructor("Ichigo", 23, 1.25);
        f028_StudentsConstructor student2 = new f028_StudentsConstructor("Sakuragi", 23, 2.50);
        f028_StudentsConstructor student3 = new f028_StudentsConstructor("Naruto", 20, 3.00);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}
