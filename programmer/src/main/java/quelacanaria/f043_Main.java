package quelacanaria;
//abstract/abstraction Used to define abstract classes and methods. Abstraction is
//the process of hiding implementation details and showing only the essential
//features; Abstract classes can't be instantiated directly Can contain 'abstract'
//methods (which must be implemented) Can contain 'concrete' method (which are inherited)
public class f043_Main {
    public static void main(String[] args) {

        f043_Circle circle = new f043_Circle(3);
        f043_Rectangle rectangle = new f043_Rectangle(4,5);
        f043_Triangle triangle = new f043_Triangle(6,7);

        circle.display();
        rectangle.display();
        triangle.display();

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }

}
