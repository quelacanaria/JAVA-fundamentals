package quelacanaria;

public class f043_Circle extends f043_Shape{

    double radius;

    f043_Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

}
